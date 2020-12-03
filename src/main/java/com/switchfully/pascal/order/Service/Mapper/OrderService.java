package com.switchfully.pascal.order.Service.Mapper;


import com.switchfully.pascal.order.Business.Entity.Order;
import com.switchfully.pascal.order.Business.Repository.OrderRepository;
import com.switchfully.pascal.order.Exceptions.OrderNotFoundException;
import com.switchfully.pascal.order.Service.DTO.CustomerDTO;
import com.switchfully.pascal.order.Service.DTO.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private OrderMapper orderMapper;
    public Map<String, Order> orders = null;  // emailaddress will be key again

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = create(orderMapper.createOrder(orderDTO));
        return orderMapper.toDTO(order);

    }

    public OrderDTO getOrderByEmail(String emailAddress) {
        return orderMapper.toDTO(getOrder(emailAddress));

    }

    /// JPA 03/12/2020 ////

    public List<OrderDTO> getOrders() {
        return StreamSupport.stream(orderRepository.findAll().spliterator(), false)
                .map(orderMapper::toDTO)
                .collect(Collectors.toList());

    }

    public Order create(Order order) {
        if (order == null) throw new OrderNotFoundException("No data given");
        if (orders.containsValue(order)) throw new OrderNotFoundException
                (order.getEmailAddress() + " already exists");
        orders.put(order.getEmailAddress(), order);
        return order;
    }

    public Order getOrder(String emailAddress) {
        Order order = orders.get(emailAddress);
        if (Objects.isNull(order)) {
            throw new OrderNotFoundException("There is no order available with this email" + emailAddress);
        }

        return order;

    }
}
