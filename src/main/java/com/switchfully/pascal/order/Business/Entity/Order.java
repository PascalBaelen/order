package com.switchfully.pascal.order.Business.Entity;


import java.time.LocalDate;
import java.util.Objects;


////////////// NOT USED WITH DB LOGIC SO FAR ////////////////////
////////////// CAN REMAIN UNCHANGED 03/12/2020 //////////////////


public class Order {
    public static final Integer TIME_TO_SHIP_DELAYED_IN_WEEKS = 1;
    private final String emailAddress;
    private final double totalAmountToPay;
    private LocalDate dateOfShipMent;
    private final String selectedItem;
    private final int wantedAmount;
    private CalculateInvoice calculateInvoice;

    public Order(String emailAddress, double totalAmountToPay, LocalDate dateOfShipMent, String selectedItem, int wantedAmount) {
        this.emailAddress = emailAddress;
        this.totalAmountToPay = totalAmountToPay;
        this.dateOfShipMent = LocalDate.now();
        this.selectedItem = selectedItem;
        this.wantedAmount = wantedAmount;
    }

    // This section has to be removed, in OrderDTO as well, it's creates an extra line in execution with JSON !!! //
    //                  I left it in the program so that I will never forget this !!!                             //
    public static Integer getTimeToShipDelayedInWeeks() {
        return TIME_TO_SHIP_DELAYED_IN_WEEKS;
    }

    public LocalDate getDateOfDelayedShipMent() {
        return dateOfShipMent = LocalDate.now().plusWeeks(TIME_TO_SHIP_DELAYED_IN_WEEKS);
    }
    //                                 end section to be removed                                                 //

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
