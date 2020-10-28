package com.switchfully.pascal.order.Service.Mapper;

import com.switchfully.pascal.order.Business.Entity.Customer;
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

    public List<CustomerDTO> getAllCustomerDTOs() {
        return customerRepository.getCustomers().stream()
                .map(customer -> customerMapper.detailDTO(customer))
                .collect(Collectors.toList());
    }

    public CustomerDTO createMember(CustomerDTO customerDTO) {
        Customer customer = customerRepository.create(customerMapper.createCustomer(customerDTO));
        return customerMapper.detailDTO(customer);

    }

    public CustomerDTO getMemberByEmail(String emailAddress) {
        return customerMapper.detailDTO(customerRepository.getCustomer(emailAddress));

    }


}


