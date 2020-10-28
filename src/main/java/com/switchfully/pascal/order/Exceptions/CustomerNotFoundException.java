package com.switchfully.pascal.order.Exceptions;


import com.switchfully.pascal.order.Business.Entity.Customer;

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

