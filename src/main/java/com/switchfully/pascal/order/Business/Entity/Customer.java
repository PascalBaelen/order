package com.switchfully.pascal.order.Business.Entity;

import com.switchfully.pascal.order.Business.Entity.Address;

public class Customer {

    private final String firstName;
    private final String name;
    private final String emailAddress; // this will be the key
    private final String phoneNumber;
    private final Address address;


    public Customer(String firstName, String name, String emailAddress, String phoneNumber, Address address) {
        this.firstName = firstName;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
