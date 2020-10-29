package com.switchfully.pascal.order.Exceptions;



public class CustomerNotFoundException extends RuntimeException {
        private String errorMessage;

        public CustomerNotFoundException(String errorMessage)
        {this.errorMessage = errorMessage;
        }

    @Override
    public String toString() {
        return "CustomerNotFoundException{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}

