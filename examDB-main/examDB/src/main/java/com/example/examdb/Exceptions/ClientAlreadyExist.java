package com.example.examdb.Exceptions;

public class ClientAlreadyExist extends Exception{
    public ClientAlreadyExist() {
        super("Sorry, Client already exist!");
    }
}
