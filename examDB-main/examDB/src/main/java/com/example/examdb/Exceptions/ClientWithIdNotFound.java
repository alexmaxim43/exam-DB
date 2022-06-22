package com.example.examdb.Exceptions;

public class ClientWithIdNotFound extends Exception{
    public ClientWithIdNotFound() {
        super("Client with that id doesn't exist");
    }
}
