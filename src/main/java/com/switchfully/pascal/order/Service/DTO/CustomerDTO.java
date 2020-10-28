package com.switchfully.pascal.order.Service.DTO;

import com.switchfully.pascal.order.Business.Entity.Address;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDTO that = (CustomerDTO) o;
        return firstName.equals(that.firstName) &&
                name.equals(that.name) &&
                emailAddress.equals(that.emailAddress) &&
                phoneNumber.equals(that.phoneNumber) &&
                address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, name, emailAddress, phoneNumber, address);
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


}


