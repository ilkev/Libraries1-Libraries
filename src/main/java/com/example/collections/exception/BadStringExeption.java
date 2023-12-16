package com.example.collections.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadStringExeption extends RuntimeException{
    public BadStringExeption() {
    }

    public BadStringExeption(String message) {
        super(message);
    }

    public BadStringExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public BadStringExeption(Throwable cause) {
        super(cause);
    }

    public BadStringExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
