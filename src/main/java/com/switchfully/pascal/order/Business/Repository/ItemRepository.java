package com.switchfully.pascal.order.Business.Repository;

import com.switchfully.pascal.order.Business.Entity.Address;
import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Business.Entity.Items;
import com.switchfully.pascal.order.Exceptions.ItemAlreadyExistsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemRepository {
    private Map<String, Items> itemsList;

    public ItemRepository() {
        this.itemsList = new HashMap<>();
    }

    public Items create(Items items) {
        if (items == null) throw new IllegalArgumentException("No data found");
        if (itemsList.containsValue(items)) throw new ItemAlreadyExistsException(items.getId());
        itemsList.put(items.getId(), items);
        return items;
    }

    public void createXampleItems() {
        Items item1 = new Items("CornedBeef","canned beef",1.56,52,"12345abcde");
        Items item2 = new Items("Chocotoffs","caramels with choclat napping", 3.01,00,"54321abcde");
        itemsList.put("12345abcde", item1);
        itemsList.put("abcde54321", item2);
    }

    public List<Items> getItems() {
        return new ArrayList<>(itemsList.values());
    }
}

