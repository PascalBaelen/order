package com.switchfully.pascal.order.Service.Mapper;

import com.switchfully.pascal.order.Business.Repository.CustomerRepository;
import com.switchfully.pascal.order.Service.DTO.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

   private CustomerRepository customerRepository;
   private CustomerMapper customerMapper;


    @Autowired
    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public CustomerMapper getCustomerMapper() {
        return customerMapper;
    }
    public List<CustomerDTO> getAllCustomerDTOs() {
        return customerRepository.getCustomers().stream()
                .map(customer -> customerMapper.toDTO(customer))
                .collect(Collectors.toList());
}
}