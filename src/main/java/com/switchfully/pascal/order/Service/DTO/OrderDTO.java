package com.switchfully.pascal.order.Service.DTO;

import java.time.LocalDate;
import java.util.Objects;

public class OrderDTO {

        private Integer TIME_TO_SHIP_DELAYED_IN_WEEKS = 1;
        private String emailAddress;
        private double totalAmountToPay;
        private LocalDate dateOfShipMent;
        private String selectedItem;
        private int wantedAmount;

    public Integer getTIME_TO_SHIP_DELAYED_IN_WEEKS() {
        return TIME_TO_SHIP_DELAYED_IN_WEEKS;
    }

    public void setTIME_TO_SHIP_DELAYED_IN_WEEKS(Integer TIME_TO_SHIP_DELAYED_IN_WEEKS) {
        this.TIME_TO_SHIP_DELAYED_IN_WEEKS = TIME_TO_SHIP_DELAYED_IN_WEEKS;
    }

    public LocalDate getDateOfDelayedShipMent() {
        return dateOfShipMent = LocalDate.now().plusWeeks(TIME_TO_SHIP_DELAYED_IN_WEEKS);
    }

    public LocalDate setDateOfDelayedShipMent(LocalDate dateOfShipMent) {
        return this.dateOfShipMent = LocalDate.now().plusWeeks(TIME_TO_SHIP_DELAYED_IN_WEEKS);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getTotalAmountToPay() {
        return totalAmountToPay;
    }

    public void setTotalAmountToPay(double totalAmountToPay) {
        this.totalAmountToPay = totalAmountToPay;
    }

    public LocalDate getDateOfShipMent() {
        this.dateOfShipMent = LocalDate.now();
        return dateOfShipMent;
    }

    public void setDateOfShipMent(LocalDate dateOfShipMent) {
        this.dateOfShipMent = LocalDate.now();
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
        OrderDTO orderDTO = (OrderDTO) o;
        return Double.compare(orderDTO.totalAmountToPay, totalAmountToPay) == 0 &&
                wantedAmount == orderDTO.wantedAmount &&
                Objects.equals(TIME_TO_SHIP_DELAYED_IN_WEEKS, orderDTO.TIME_TO_SHIP_DELAYED_IN_WEEKS) &&
                Objects.equals(emailAddress, orderDTO.emailAddress) &&
                Objects.equals(dateOfShipMent, orderDTO.dateOfShipMent) &&
                Objects.equals(selectedItem, orderDTO.selectedItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TIME_TO_SHIP_DELAYED_IN_WEEKS, emailAddress, totalAmountToPay, dateOfShipMent, selectedItem, wantedAmount);
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "TIME_TO_SHIP_DELAYED_IN_WEEKS=" + TIME_TO_SHIP_DELAYED_IN_WEEKS +
                ", emailAddress='" + emailAddress + '\'' +
                ", totalAmountToPay=" + totalAmountToPay +
                ", dateOfShipMent=" + dateOfShipMent +
                ", selectedItem='" + selectedItem + '\'' +
                ", wantedAmount=" + wantedAmount +
                '}';
    }
}
