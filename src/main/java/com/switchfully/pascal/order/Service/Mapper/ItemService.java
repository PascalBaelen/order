package com.switchfully.pascal.order.Service.Mapper;

import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Business.Entity.Items;
import com.switchfully.pascal.order.Business.Repository.ItemRepository;
import com.switchfully.pascal.order.Service.DTO.CustomerDTO;
import com.switchfully.pascal.order.Service.DTO.ItemsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Autowired
    public ItemService(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    public ItemsDTO createItem(ItemsDTO itemsDTO)
    {
        Items items = itemRepository.create(itemMapper.createItems(itemsDTO));
        return itemMapper.toDTO(items);
    }

    public List<ItemsDTO> getAllItemDTOs() {
        return itemRepository.getItems()
                .stream()
                .map(items -> itemMapper.toDTO(items))
                .collect(Collectors.toList());
    }

    public ItemsDTO getItemById(String id) {
        return itemMapper.toDTO(itemRepository.getItem(id));

    }
}
