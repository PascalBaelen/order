package com.switchfully.pascal.order.Business.Entity;

import java.time.LocalDate;

public class CalculateInvoice {

    private final double totalAmountToPay;
    private LocalDate dateOfShipMent;
    private final String selectedItem;
    private final int wantedAmount;
    private Order order;
    private Customer customer;

    public CalculateInvoice(double totalAmountToPay, LocalDate dateOfShipMent, String selectedItem, int wantedAmount, Order order, Customer customer) {
        this.totalAmountToPay = totalAmountToPay;
        this.dateOfShipMent = dateOfShipMent;
        this.selectedItem = selectedItem;
        this.wantedAmount = wantedAmount;
        this.order = order;
        this.customer = customer;
    }

    public Order CalculateTotalAmount(CalculateInvoice calculateInvoice) {
        // do all the business logic here - still working on that
        return null;
    }
}