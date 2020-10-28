package com.switchfully.pascal.order.Business.Entity;

import java.util.Objects;
import java.util.UUID;

public class Items {
    private final String name;
    private final String description;
    private double price;
    private int amountInStock;
    private String id;

    public Items(String name, String description, double price, int amountInStock, String id) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountInStock = amountInStock;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Double.compare(items.price, price) == 0 &&
                amountInStock == items.amountInStock &&
                name.equals(items.name) &&
                description.equals(items.description) &&
                id.equals(items.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, amountInStock, id);
    }

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", amountInStock=" + amountInStock +
                ", id='" + id + '\'' +
                '}';
    }
}