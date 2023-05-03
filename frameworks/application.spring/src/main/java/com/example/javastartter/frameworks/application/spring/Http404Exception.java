package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.application.core.ApplicationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Http404Exception extends ApplicationException {

    public Http404Exception(Throwable throwable) {
        super(throwable);
    }

}
