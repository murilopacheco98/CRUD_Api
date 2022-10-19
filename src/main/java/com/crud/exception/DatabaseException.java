package com.crud.exception;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String mensagem) {
        super(mensagem);
    }
}
