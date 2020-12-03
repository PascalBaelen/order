package com.switchfully.pascal.order.Service.Mapper;

import com.switchfully.pascal.order.Business.Entity.Items;
import com.switchfully.pascal.order.Business.Repository.ItemRepository;
import com.switchfully.pascal.order.Exceptions.ItemAlreadyExistsException;
import com.switchfully.pascal.order.Exceptions.ItemNotFoundException;
import com.switchfully.pascal.order.Service.DTO.CustomerDTO;
import com.switchfully.pascal.order.Service.DTO.ItemsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ItemService {
    private ItemRepository itemRepository;
    private ItemMapper itemMapper;
    public Map<String, Items> itemsList;

    @Autowired
    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public ItemsDTO createItem(ItemsDTO itemsDTO) {
        Items items = create(itemMapper.createItems(itemsDTO));
        return itemMapper.toDTO(items);
    }

    public ItemsDTO getItemById(String id) {
        return itemMapper.toDTO(getItem(id));

    }

    /// JPA 03/12/2020 ////

    public List<ItemsDTO> getItemsDTOs() {
        return StreamSupport.stream(itemRepository.findAll().spliterator(), false)
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());

    }

    public Items create(Items items) {
        if (items == null) throw new IllegalArgumentException("No data found");
        if (itemsList.containsValue(items)) throw new ItemAlreadyExistsException(items.getIdUUID());
        itemsList.put(items.getIdUUID(), items);
        return items;
    }

    public Items getItem(String id) {
        Items items = itemsList.get(id);
        if (Objects.isNull(items)) {
            throw new ItemNotFoundException("There is no item available with this id" + id);
        }
        return items;

    }


}
