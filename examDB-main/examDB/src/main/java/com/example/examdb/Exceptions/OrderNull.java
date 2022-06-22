package com.example.examdb.Exceptions;

public class OrderNull extends Exception {
    public OrderNull() {
        super("Your order can't be empty!");
    }
}
