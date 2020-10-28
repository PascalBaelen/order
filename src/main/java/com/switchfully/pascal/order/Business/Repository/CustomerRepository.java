package com.switchfully.pascal.order.Business.Repository;

import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Service.Mapper.CustomerMapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CustomerRepository {

    private Map<String, Customer> customers;  // key will be emailAddress;
    private CustomerMapper customerMapper;

    public CustomerRepository() {

    }
}

