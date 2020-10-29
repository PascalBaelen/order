package com.switchfully.pascal.order.Business.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {

    @Test
    public void buildNewProductItemWithName() {
        String UUID1 = UUID.randomUUID().toString();
        Items items = new Items("CornedBeef", "canned beef", 1.56, 52, UUID1);
        Assertions.assertEquals("CornedBeef", items.getName());

    }
    @Test
    public void buildNewProductItemWithDescription() {
        String UUID1 = UUID.randomUUID().toString();
        Items items = new Items("CornedBeef", "canned beef", 1.56, 52, UUID1);
        Assertions.assertEquals("canned beef", items.getDescription());

    }

    @Test
    public void buildNewProductItemWithPrice() {
        String UUID1 = UUID.randomUUID().toString();
        Items items = new Items("CornedBeef", "canned beef", 1.56, 52, UUID1);
        Assertions.assertEquals(1.56, items.getPrice());

    }
    @Test
    public void buildNewProductItemWithAmountInStock() {
        String UUID1 = UUID.randomUUID().toString();
        Items items = new Items("CornedBeef", "canned beef", 1.56, 52, UUID1);
        Assertions.assertEquals(52,items.getAmountInStock());

    }
}