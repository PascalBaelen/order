package com.switchfully.pascal.order.Business.Repository;

import com.switchfully.pascal.order.Business.Entity.Address;
import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Business.Entity.Items;
import com.switchfully.pascal.order.Exceptions.CustomerNotFoundException;
import com.switchfully.pascal.order.Exceptions.ItemAlreadyExistsException;
import com.switchfully.pascal.order.Exceptions.ItemNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ItemRepository {
    private Map<String, Items> itemsList;

    public ItemRepository() {
        this.itemsList = new HashMap<>();
        createXampleItems();
    }

    public Items create(Items items) {
        if (items == null) throw new IllegalArgumentException("No data found");
        if (itemsList.containsValue(items)) throw new ItemAlreadyExistsException(items.getId());
        itemsList.put(items.getId(), items);
        return items;
    }

    public void createXampleItems() {
        Items item1 = new Items("CornedBeef", "canned beef", 1.56, 52, "12345abcde");
        Items item2 = new Items("Chocotoffs", "caramels with choclat napping", 3.01, 00, "54321abcde");
        itemsList.put("12345abcde", item1);
        itemsList.put("abcde54321", item2);
    }

    public Items getItem(String id) {
        Items items = itemsList.get(id);
        if (Objects.isNull(items)) {
            throw new ItemNotFoundException("There is no item available with this id" + id);
        }

        return items;

    }

    public List<Items> getItems() {
        return new ArrayList<>(itemsList.values());
    }
}

