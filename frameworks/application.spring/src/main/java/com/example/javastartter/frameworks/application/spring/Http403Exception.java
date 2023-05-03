package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.application.core.ApplicationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class Http403Exception extends ApplicationException {

    public Http403Exception(Throwable throwable) {
        super(throwable);
    }

}
