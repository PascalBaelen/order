package com.switchfully.pascal.order.Business.Entity;


import java.time.LocalDate;
import java.util.Objects;

public class Order {
    public static final Integer TIME_TO_SHIP_DELAYED_IN_WEEKS = 1;
    private final String emailAddress;
    private final double totalAmountToPay;
    private LocalDate dateOfShipMent;
    private final String selectedItem;
    private final int wantedAmount;

    public Order(String emailAddress, double totalAmountToPay, LocalDate dateOfShipMent, String selectedItem, int wantedAmount) {
        this.emailAddress = emailAddress;
        this.totalAmountToPay = totalAmountToPay;
        this.dateOfShipMent = LocalDate.now();
        this.selectedItem = selectedItem;
        this.wantedAmount = wantedAmount;
    }

    public static Integer getTimeToShipDelayedInWeeks() {
        return TIME_TO_SHIP_DELAYED_IN_WEEKS;
    }

    public LocalDate getDateOfDelayedShipMent() {
        return dateOfShipMent = LocalDate.now().plusWeeks(TIME_TO_SHIP_DELAYED_IN_WEEKS);
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

    public String getSelectedItem() {
        return selectedItem;
    }

    public int getWantedAmount() {
        return wantedAmount;
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
