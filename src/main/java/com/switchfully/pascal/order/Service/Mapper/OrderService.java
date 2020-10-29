package com.switchfully.pascal.order.Service.Mapper;


import com.switchfully.pascal.order.Business.Entity.Order;
import com.switchfully.pascal.order.Business.Repository.OrderRepository;
import com.switchfully.pascal.order.Service.DTO.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    public List<OrderDTO> getAllOrderDTOs() {
        return orderRepository.getOrders().stream()
                .map(order -> orderMapper.toDTO(order))
                .collect(Collectors.toList());
    }
    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = orderRepository.create(orderMapper.createOrder(orderDTO));
        return orderMapper.toDTO(order);

    }

    public OrderDTO getOrderByEmail(String emailAddress) {
        return orderMapper.toDTO(orderRepository.getOrder(emailAddress));

    }

}
