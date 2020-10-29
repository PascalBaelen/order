package com.switchfully.pascal.order.Service.Mapper;

import com.switchfully.pascal.order.Business.Entity.Items;
import com.switchfully.pascal.order.Service.DTO.ItemsDTO;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
    public Items createItems(ItemsDTO itemsDTO) {
        return new Items(
                itemsDTO.getName(),
                itemsDTO.getDescription(),
                itemsDTO.getPrice(),
                itemsDTO.getAmountInStock(),
                itemsDTO.getId());

    }

    public ItemsDTO toDTO(Items items) {
        ItemsDTO result = new ItemsDTO();
        result.setId(items.getId());
        result.setName(items.getName());
        result.setDescription(items.getDescription());
        result.setAmountInStock(items.getAmountInStock());
        result.setPrice(items.getPrice());
        return result;

    }


}
