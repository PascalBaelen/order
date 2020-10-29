package com.switchfully.pascal.order.Service.Mapper;


import com.switchfully.pascal.order.Business.Entity.Order;
import com.switchfully.pascal.order.Service.DTO.CustomerDTO;
import com.switchfully.pascal.order.Service.DTO.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    private CustomerDTO customerDTO;

    public Order createOrder(OrderDTO orderDTO) {
        return new Order(
                orderDTO.getEmailAddress(),
                orderDTO.getTotalAmountToPay(),
                orderDTO.getDateOfShipMent(),
                orderDTO.getSelectedItem(),
                orderDTO.getWantedAmount());

    }

    public OrderDTO toDTO(Order order) {
        OrderDTO result = new OrderDTO();
        result.setEmailAddress(order.getEmailAddress());
        result.setTotalAmountToPay(order.getTotalAmountToPay());
        result.setDateOfDelayedShipMent(order.getDateOfShipMent());
        result.setSelectedItem(order.getSelectedItem());
        result.setWantedAmount(order.getWantedAmount());
        return result;

    }

}
