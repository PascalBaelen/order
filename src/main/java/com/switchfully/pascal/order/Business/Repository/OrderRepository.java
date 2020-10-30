package com.switchfully.pascal.order.Business.Repository;

import com.switchfully.pascal.order.Business.Entity.Address;
import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Business.Entity.Order;
import com.switchfully.pascal.order.Exceptions.CustomerNotFoundException;
import com.switchfully.pascal.order.Exceptions.OrderNotFoundException;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class OrderRepository {

    private Map<String, Order> orders;  // emailaddress will be key again

    public OrderRepository() {
        this.orders = new HashMap<>();
        createXampleOrders();
    }

    public Order create(Order order) {
        if (order == null) throw new OrderNotFoundException("No data given");
        if (orders.containsValue(order)) throw new OrderNotFoundException
                (order.getEmailAddress() + " already exists");
        orders.put(order.getEmailAddress(), order);
        return order;
    }

    public void createXampleOrders() {
        Order order1 = new Order("pascal.baelen@live.com", 334.22,
                LocalDate.ofYearDay(2020, 322), "33a418c6-7a34-4af1-9127-2799ce0c4f31", 22);
        Order order2 = new Order("mateo.baelen@live.com", 168.12,
                LocalDate.ofYearDay(2020, 321), "44a418c6-7a34-4af1-9127-2799ce0c4f44", 07);
        orders.put("pascal.baelen@live.com", order1);
        orders.put("mateo.baelen@live.com", order2);
    }

    public Order getOrder(String emailAddress) {
        Order order = orders.get(emailAddress);
        if (Objects.isNull(order)) {
            throw new OrderNotFoundException("There is no order available with this email" + emailAddress);
        }

        return order;

    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders.values());
    }
}

