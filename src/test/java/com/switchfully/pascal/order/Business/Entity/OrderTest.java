package com.switchfully.pascal.order.Business.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    public void buildNewOrderWithEmailAddressKey() {
        Order order = new Order("pascal.baelen@live.com", 334.22,
        LocalDate.ofYearDay(2020, 322), "33a418c6-7a34-4af1-9127-2799ce0c4f31", 22);
        Assertions.assertEquals("pascal.baelen@live.com", order.getEmailAddress());

    }
    @Test
    public void buildNewOrderWithTotalAmountToPay() {
        Order order = new Order("pascal.baelen@live.com", 334.22,
                LocalDate.ofYearDay(2020, 322), "33a418c6-7a34-4af1-9127-2799ce0c4f31", 22);
        Assertions.assertEquals(334.22, order.getTotalAmountToPay());

    }

    @Test
    public void buildNewOrderWithWantedAmount() {
        Order order = new Order("pascal.baelen@live.com", 334.22,
                LocalDate.ofYearDay(2020, 322), "33a418c6-7a34-4af1-9127-2799ce0c4f31", 22);
        Assertions.assertEquals(22, order.getWantedAmount());

    }

    @Test
    public void buildNewOrderWithSelectedItem() {
        Order order = new Order("pascal.baelen@live.com", 334.22,
                LocalDate.ofYearDay(2020, 322), "33a418c6-7a34-4af1-9127-2799ce0c4f31", 22);
        Assertions.assertEquals("33a418c6-7a34-4af1-9127-2799ce0c4f31", order.getSelectedItem());

    }
    @Test
    public void buildNewOrderWithShipmentDate() {
        Order order = new Order("pascal.baelen@live.com", 334.22,
                LocalDate.ofYearDay(2020, 322), "33a418c6-7a34-4af1-9127-2799ce0c4f31", 22);
        Assertions.assertEquals(LocalDate.ofYearDay(2020,322),order.getDateOfShipMent());

    }
}