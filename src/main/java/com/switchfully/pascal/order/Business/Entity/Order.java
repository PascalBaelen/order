package com.switchfully.pascal.order.Business.Entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="order")
public class Order {
    @Id
    @SequenceGenerator(name = "member_seq", sequenceName = "member_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")

    public static Integer TIME_TO_SHIP_DELAYED_IN_WEEKS = 1;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "total_amount_to_pay")
    private double totalAmountToPay;
    @Column(name = "date_of_Shipment")
    private LocalDate dateOfShipMent;
    @Column(name = "selected_item")
    private String selectedItem;
    @Column(name = "wanted_amount")
    private int wantedAmount;

    public Order(String emailAddress, double totalAmountToPay, LocalDate dateOfShipMent, String selectedItem, int wantedAmount) {
        this.emailAddress = emailAddress;
        this.totalAmountToPay = totalAmountToPay;
        this.dateOfShipMent = dateOfShipMent;
        this.selectedItem = selectedItem;
        this.wantedAmount = wantedAmount;
    }

    public Order() {
    }

    public static Integer getTimeToShipDelayedInWeeks() {
        return TIME_TO_SHIP_DELAYED_IN_WEEKS;
    }

    public static void setTimeToShipDelayedInWeeks(Integer timeToShipDelayedInWeeks) {
        TIME_TO_SHIP_DELAYED_IN_WEEKS = timeToShipDelayedInWeeks;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getTotalAmountToPay() {
        return totalAmountToPay;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.totalAmountToPay, totalAmountToPay) == 0 &&
                wantedAmount == order.wantedAmount &&
                Objects.equals(emailAddress, order.emailAddress) &&
                Objects.equals(dateOfShipMent, order.dateOfShipMent) &&
                Objects.equals(selectedItem, order.selectedItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailAddress, totalAmountToPay, dateOfShipMent, selectedItem, wantedAmount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "emailAddress='" + emailAddress + '\'' +
                ", totalAmountToPay=" + totalAmountToPay +
                ", dateOfShipMent=" + dateOfShipMent +
                ", selectedItem='" + selectedItem + '\'' +
                ", wantedAmount=" + wantedAmount +
                '}';
    }
}



//    // This section has to be removed, in OrderDTO as well, it's creates an extra line in execution with JSON !!! //
//    //                  I left it in the program so that I will never forget this !!!                             //
//    public static Integer getTimeToShipDelayedInWeeks() {
//        return TIME_TO_SHIP_DELAYED_IN_WEEKS;
//    }
//
//    public LocalDate getDateOfDelayedShipMent() {
//        return dateOfShipMent = LocalDate.now().plusWeeks(TIME_TO_SHIP_DELAYED_IN_WEEKS);
//    }
//    //                                 end section to be removed                                                 //
