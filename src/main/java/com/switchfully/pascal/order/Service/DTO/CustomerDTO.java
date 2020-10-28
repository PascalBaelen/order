package com.switchfully.pascal.order.Service.DTO;

import com.switchfully.pascal.order.Business.Entity.Address;

public class CustomerDTO {

    private final String firstName;
    private final String name;
    private final String emailAddress;
    private final String phoneNumber;
    private final Address address;

    public CustomerDTO(String firstName, String name, String emailAddress, String phoneNumber, Address address) {
        this.firstName = firstName;
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
    }

    //equals hashcode nog toevoegen
}


