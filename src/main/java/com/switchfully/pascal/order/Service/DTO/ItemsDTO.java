package com.switchfully.pascal.order.Service.DTO;

import java.util.Objects;
import java.util.UUID;

public class ItemsDTO {
    private String name;
    private String description;
    private double price;
    private int amountInStock;
    private String id;


//    public ItemsDTO(String name, String description, double price, int amountInStock) {
//        this.id = UUID.randomUUID().toString();
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.amountInStock = amountInStock;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemsDTO itemsDTO = (ItemsDTO) o;
        return Double.compare(itemsDTO.price, price) == 0 &&
                amountInStock == itemsDTO.amountInStock &&
                Objects.equals(name, itemsDTO.name) &&
                Objects.equals(description, itemsDTO.description) &&
                Objects.equals(id, itemsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, amountInStock, id);
    }

    @Override
    public String toString() {
        return "ItemsDTO{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", amountInStock=" + amountInStock +
                ", id='" + id + '\'' +
                '}';
    }

}