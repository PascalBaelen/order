package com.switchfully.pascal.order.Exceptions;

public class ItemAlreadyExistsException extends  RuntimeException{

        private String errorMessage;

        public ItemAlreadyExistsException(String errorMessage)
        {this.errorMessage = errorMessage;
        }

    @Override
    public String toString() {
        return "ItemAlreadyExistsException{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
