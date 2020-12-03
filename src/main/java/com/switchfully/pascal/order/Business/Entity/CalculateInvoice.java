package com.switchfully.pascal.order.Business.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="invoice")
public class CalculateInvoice {
    @Id
    @SequenceGenerator(name = "member_seq", sequenceName = "member_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    @Column(name = "id")
    private long id;
    @Column(name = "total_amount_to_pay")
    private double totalAmountToPay;
    @Column(name = "date_of_shipment")
    private LocalDate dateOfShipMent;
    @Column(name = "selected_item")
    private String selectedItem;
    @Column(name = "wanted_amount")
    private int wantedAmount;
    @Column(name = "email_customer")
    private String email;
    @Column(name = "invoice_number")
    private String invoiceNumber;


    public CalculateInvoice() {
    }

    public CalculateInvoice(double totalAmountToPay, LocalDate dateOfShipMent, String selectedItem, int wantedAmount, String email, String invoiceNumber) {
        this.totalAmountToPay = totalAmountToPay;
        this.dateOfShipMent = dateOfShipMent;
        this.selectedItem = selectedItem;
        this.wantedAmount = wantedAmount;
        this.email = email;
        this.invoiceNumber = invoiceNumber;
    }

    public double getTotalAmountToPay() {
        return totalAmountToPay;
    }

    public void setTotalAmountToPay(double totalAmountToPay) {
        this.totalAmountToPay = totalAmountToPay;
    }

    public LocalDate getDateOfShipMent() {
        return dateOfShipMent;
    }

    public void setDateOfShipMent(LocalDate dateOfShipMent) {
        this.dateOfShipMent = dateOfShipMent;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public int getWantedAmount() {
        return wantedAmount;
    }

    public void setWantedAmount(int wantedAmount) {
        this.wantedAmount = wantedAmount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "CalculateInvoice{" +
                "totalAmountToPay=" + totalAmountToPay +
                ", dateOfShipMent=" + dateOfShipMent +
                ", selectedItem='" + selectedItem + '\'' +
                ", wantedAmount=" + wantedAmount +
                ", email='" + email + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                '}';
    }
}
