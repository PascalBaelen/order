package com.switchfully.pascal.order.Business.Repository;

import com.switchfully.pascal.order.Business.Entity.Address;
import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Business.Entity.Items;
import com.switchfully.pascal.order.Exceptions.CustomerNotFoundException;
import com.switchfully.pascal.order.Exceptions.ItemAlreadyExistsException;
import com.switchfully.pascal.order.Exceptions.ItemNotFoundException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


// erase all memory DB and place CrudRepository 03/12/2020 //
@Repository
public interface ItemRepository extends CrudRepository <Items,Long>
{}


//   public Map<String, Items> itemsList= null;  //key will be randomiser UUID
//
//    public ItemRepository() {
//        this.itemsList = new HashMap<>();
//        createXampleItems();
//    }
//
//    public default Items create(Items items) {
//        if (items == null) throw new IllegalArgumentException("No data found");
//        if (itemsList.containsValue(items)) throw new ItemAlreadyExistsException(items.getIdUUID());
//        itemsList.put(items.getIdUUID(), items);
//        return items;
//    }
//
//    public void createXampleItems() {
//        String UUID1  = UUID.randomUUID().toString();
//        String UUID2  = UUID.randomUUID().toString();
//        Items item1 = new Items("CornedBeef", "canned beef", 1.56, 52,UUID1);
//        Items item2 = new Items("Chocotoffs", "caramels with chocolat napping", 3.01, 02, UUID2);
//        itemsList.put(UUID1, item1);
//        itemsList.put(UUID2, item2);
//    }
//
//    public default Items getItem(String id) {
//        Items items = itemsList.get(id);
//        if (Objects.isNull(items)) {
//            throw new ItemNotFoundException("There is no item available with this id" + id);
//        }
//
//        return items;
//
//    }
//
//    public default List<Items> getItems() {
//        return new ArrayList<>(itemsList.values());
//    }
//}
//
