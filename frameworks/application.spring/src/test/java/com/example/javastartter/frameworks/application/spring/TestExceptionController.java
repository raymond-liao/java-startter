package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.application.core.UseCase;
import com.example.javastartter.frameworks.domain.core.AggregateNotFoundException;
import com.example.javastartter.frameworks.domain.core.AuthenticationException;
import com.example.javastartter.frameworks.domain.core.BadInputException;
import com.example.javastartter.frameworks.security.core.Authorities;
import com.example.javastartter.frameworks.security.core.AuthorizationException;
import com.example.javastartter.frameworks.security.core.GrantedAuthorities;
import com.example.javastartter.frameworks.security.core.RequiredAuthorities;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.javastartter.frameworks.domain.core.I18nMessage.message;

@RestController
@RequestMapping("/test")
@UseCase(requiredAuthorities = Authorities.ANONYMOUS)
public class TestExceptionController {

    @PostMapping("trigger-aggregate-not-found-exception")
    public void triggerAggregateNotFoundException() {
        throw new AggregateNotFoundException();
    }

    @PostMapping("trigger-bad-input-exception")
    public void triggerIllegalArgumentException() {
        throw new BadInputException(message("error.bad-input"));
    }

    @PostMapping("trigger-authentication-exception")
    public void triggerAuthenticationException() {
        throw new AuthenticationException(message("error.bad-credential"));
    }

    @PostMapping("trigger-authorization-exception")
    public void triggerAuthorizationException() {
        throw new AuthorizationException(message("error.access-denied", RequiredAuthorities.of("f1"), GrantedAuthorities.of("f2")));
    }

}
