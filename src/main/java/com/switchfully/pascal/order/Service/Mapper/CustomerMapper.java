package com.switchfully.pascal.order.Service.Mapper;

import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Service.DTO.CustomerDTO;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer createCustomer(CustomerDTO customerDTO) {
        return new Customer(
                customerDTO.getFirstName(),
                customerDTO.getName(),
                customerDTO.getEmailAddress(),
                customerDTO.getPhoneNumber(),
                customerDTO.getAddress());

    }

    public CustomerDTO toDTO(Customer customer) {
        CustomerDTO result = new CustomerDTO(customer.getFirstName(), customer.getName(),
                customer.getEmailAddress(), customer.getPhoneNumber(), customer.getAddress());
        return result;

    }
}
