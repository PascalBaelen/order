package com.switchfully.pascal.order.Service.Mapper;

import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Business.Entity.Items;
import com.switchfully.pascal.order.Business.Entity.Order;
import com.switchfully.pascal.order.Business.Repository.CustomerRepository;
import com.switchfully.pascal.order.Exceptions.CustomerNotFoundException;
import com.switchfully.pascal.order.Service.DTO.CustomerDTO;
import com.switchfully.pascal.order.Service.DTO.ItemsDTO;
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
public class CustomerService {
    public Map<String, Customer> customers;  // key will be emailAddress;
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;
    private Object CustomerDTO;

    @Autowired
    public CustomerService(CustomerRepository customerRepository,CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }


    public List<CustomerDTO> getAllCustomerDTOs() {
        return getCustomers().stream()
                .map(customer -> customerMapper.detailDTO((Customer) CustomerDTO))
                .collect(Collectors.toList());
    }
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        Customer customer = create(customerMapper.createCustomer(customerDTO));
        return customerMapper.detailDTO(customer);

    }

    public Customer create(Customer customer) {
       if (customer == null) throw new CustomerNotFoundException("No data given");
       if (customers.containsValue(customer)) throw new CustomerNotFoundException
               (customer.getEmailAddress() + " already exists");
       customers.put(customer.getEmailAddress(), customer);
       return customer;
   }

    public CustomerDTO getMemberByEmail(String emailAddress) {
           return customerMapper.detailDTO(getCustomer(emailAddress));
    }

//// JPA 03/12/2020 ////

    public List<CustomerDTO> getCustomers() {
        return StreamSupport.stream(customerRepository.findAll().spliterator(),false)
                .map(customerMapper::detailDTO)
                .collect(Collectors.toList());

    }

    public Customer getCustomer(String emailAddress) {
        Customer customer = customers.get(emailAddress);
        if (Objects.isNull(customer)) {
            throw new CustomerNotFoundException("There is no customer available with this email" + emailAddress);
        }

        return customer;

    }





}


