package com.example.javastartter.frameworks.security.core;

import com.example.javastartter.frameworks.domain.core.BadAccessTokenException;
import com.example.javastartter.frameworks.domain.core.Id;

public class InvalidSecurityContext implements SecurityContext {

    @Override
    public Id token() {
        throw new BadAccessTokenException();
    }

    @Override
    public GrantedAuthorities grantedAuthorities() {
        throw new BadAccessTokenException();
    }

    @Override
    public boolean valid() {
        return false;
    }

}
