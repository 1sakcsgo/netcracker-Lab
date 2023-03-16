package org.example.exceptions;

public class ContractNotFound extends RuntimeException{
    public ContractNotFound(String message) {
        super(message);
    }
}
