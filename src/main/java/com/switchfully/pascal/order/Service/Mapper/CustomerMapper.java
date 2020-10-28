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
    public CustomerDTO detailDTO(Customer customer) {
        CustomerDTO result = new CustomerDTO();
        result.setFirstName(customer.getFirstName());
        result.setName(customer.getName());
        result.setEmailAddress(customer.getEmailAddress());
        result.setPhoneNumber(customer.getPhoneNumber());
        result.setAddress(customer.getAddress());
        return result;

    }

}
