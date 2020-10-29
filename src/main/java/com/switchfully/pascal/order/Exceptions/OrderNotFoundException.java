package com.switchfully.pascal.order.Exceptions;

public class OrderNotFoundException extends RuntimeException {
    private String errorMessage;

    public OrderNotFoundException(String errorMessage)
    {this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ItemNotFoundException{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }

}
