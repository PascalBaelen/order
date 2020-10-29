package com.switchfully.pascal.order.Exceptions;

public class ItemNotFoundException extends RuntimeException {

    private String errorMessage;

    public ItemNotFoundException(String errorMessage)
    {this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ItemNotFoundException{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}

