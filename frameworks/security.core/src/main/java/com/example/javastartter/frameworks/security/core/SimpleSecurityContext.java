package com.example.javastartter.frameworks.security.core;

import lombok.*;
import com.example.javastartter.frameworks.domain.core.Id;

@ToString
@EqualsAndHashCode
public class SimpleSecurityContext implements SecurityContext {

    private final Id token;
    private final GrantedAuthorities grantedAuthorities;

    public SimpleSecurityContext(Id token, GrantedAuthorities grantedAuthorities) {
        this.token = token;
        this.grantedAuthorities = grantedAuthorities;
    }

    @Override
    public Id token() {
        return token;
    }

    @Override
    public GrantedAuthorities grantedAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public boolean valid() {
        return true;
    }

}
