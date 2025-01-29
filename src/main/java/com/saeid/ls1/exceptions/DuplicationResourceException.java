package com.saeid.ls1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicationResourceException extends RuntimeException {
    public DuplicationResourceException(String message) {
        super(message);
    }
}
