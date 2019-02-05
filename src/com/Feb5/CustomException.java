package com.Feb5;

public class CustomException extends Exception{

    public CustomException(String message) {
        super("Error occured in my custom exception " + message);
    }
}
