package com.switchfully.pascal.order.Business.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.UUID;


@Entity
@Table(name="items")
public class Items {
    @Id
    @Column(name="id")
    private long id;
    @Column(name="name_item")
    private String name;
    @Column(name="description_item")
    private String description;
    @Column (name="price")
    private double price;
    @Column (name ="amount_in_stock")
    private int amountInStock;
    @Column (name = "item_id")
    private String idUUID;

    public Items() {
    }

    public Items(long id, String name, String description, double price, int amountInStock, String idUUID1) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountInStock = amountInStock;
        this.idUUID = UUID.randomUUID().toString();  // this will be the key --> barcode ref
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getIdUUID() {
        return idUUID;
    }

    public void setIdUUID(String idUUID) {
        this.idUUID = idUUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return id == items.id &&
                Double.compare(items.price, price) == 0 &&
                amountInStock == items.amountInStock &&
                Objects.equals(name, items.name) &&
                Objects.equals(description, items.description) &&
                Objects.equals(idUUID, items.idUUID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, amountInStock, idUUID);
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", amountInStock=" + amountInStock +
                ", idUUID='" + idUUID + '\'' +
                '}';
    }
}