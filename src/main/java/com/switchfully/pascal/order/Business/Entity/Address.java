package com.switchfully.pascal.order.Business.Entity;

import java.util.Objects;

public class Address {

    private final String street;
    private final String streetNumber; //22A
    private final String city;
    private final String country;

    public Address(String street, String streetNumber, String city, String country) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return street.equals(address.street) &&
                streetNumber.equals(address.streetNumber) &&
                city.equals(address.city) &&
                country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, streetNumber, city, country);
    }

    public static class Order {
    }
}
