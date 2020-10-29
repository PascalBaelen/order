package com.switchfully.pascal.order.Service.DTO;

import com.switchfully.pascal.order.Business.Entity.Address;

import java.util.Objects;

public class CustomerDTO {

    private  String firstName;
    private  String name;
    private  String emailAddress;
    private  String phoneNumber;
    private  Address address;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
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


