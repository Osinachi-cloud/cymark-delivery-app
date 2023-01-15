package com.example.cymarkdelivery.exceptions;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message){
        super(message);
    }
}
