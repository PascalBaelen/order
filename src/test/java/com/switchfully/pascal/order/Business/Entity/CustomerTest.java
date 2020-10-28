package com.switchfully.pascal.order.Business.Entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    public void buildNewCustomerSeeIftheKeyEmailAddressIsWell() {
        Customer customer = new Customer("Pascal", "Baelen", "pascal.baelen@live.com", "0476/272063",
                new Address("Heuvelstraat", "43A", "Geraardsbergen", "Belgium"));

        Assertions.assertEquals("pascal.baelen@live.com", customer.getEmailAddress());


    }

    @Test
    public void buildNewCustomerSeeIfNameIsWell() {
        Customer customer = new Customer("Pascal", "Baelen", "pascal.baelen@live.com", "0476/272063",
                new Address("Heuvelstraat", "43A", "Geraardsbergen", "Belgium"));

        Assertions.assertEquals("Baelen", customer.getName());


    }

    @Test
    public void buildNewCustomerSeeIfFirstNameIsWell() {
        Customer customer = new Customer("Pascal", "Baelen", "pascal.baelen@live.com", "0476/272063",
                new Address("Heuvelstraat", "43A", "Geraardsbergen", "Belgium"));

        Assertions.assertEquals("Pascal", customer.getFirstName());


    }

    @Test
    public void buildNewCustomerSeeIfPhoneNumberIsWell() {
        Customer customer = new Customer("Pascal", "Baelen", "pascal.baelen@live.com", "0476/272063",
                new Address("Heuvelstraat", "43A", "Geraardsbergen", "Belgium"));

        Assertions.assertEquals("0476/272063", customer.getPhoneNumber());

    }
    @Test
    public void buildNewCustomerSeeIfAddressisWellBuild() {
        Customer customer = new Customer("Pascal", "Baelen", "pascal.baelen@live.com", "0476/272063",
                new Address("Heuvelstraat", "43A", "Geraardsbergen", "Belgium"));

        Assertions.assertEquals(new Address("Heuvelstraat","43A","Geraardsbergen","Belgium"), customer.getAddress());

    }


}
