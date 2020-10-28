package com.switchfully.pascal.order.Business.Repository;

import com.switchfully.pascal.order.Business.Entity.Address;
import com.switchfully.pascal.order.Business.Entity.Customer;
import com.switchfully.pascal.order.Exceptions.CustomerNotFoundException;
import com.switchfully.pascal.order.Service.Mapper.CustomerMapper;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepository {

    private Map<String, Customer> customers;  // key will be emailAddress;

    public CustomerRepository() {
        this.customers = new HashMap<>();
        createXampleCustomers();
    }

    public Customer create(Customer customer) {
        if (customer == null) throw new CustomerNotFoundException("No data given");
        if (customers.containsValue(customer)) throw new CustomerNotFoundException
                (customer.getEmailAddress() + " already exists");
        customers.put(customer.getEmailAddress(), customer);
        return customer;
    }

    public void createXampleCustomers() {
        Customer klant1 = new Customer("Pascal", "Baelen",
                "pascal.baelen@yahoo.com", "0476/272063",
                new Address("Heuvelstraat", "43A", "Geraardsbergen", "Belgium"));
        Customer klant2 = new Customer("Mateo", "Baelen",
                "mateo.baelen@yahoo.com", "0444/333222",
                new Address("Heuvelstraat", "43B", "Geraardsbergen", "Belgium"));
        customers.put("pascal.baelen@live.com", klant1);
        customers.put("mateo.baelen@live.com", klant2);
    }

    public Customer getCustomer(String emailAddress) {
        Customer customer = customers.get(emailAddress);
        if (Objects.isNull(customer)) {
            throw new CustomerNotFoundException("There is no customer available with this email" + emailAddress);
        }

        return customer;

    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers.values());
    }
}

