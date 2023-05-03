package com.example.javastartter.frameworks.context.core;

import com.example.javastartter.frameworks.domain.core.BadAccessTokenException;
import com.example.javastartter.frameworks.domain.core.Identity;

public class InvalidUserContext implements UserContext {

    @Override
    public Identity userAccount() {
        throw new BadAccessTokenException();
    }

    @Override
    public Identity user() {
        throw new BadAccessTokenException();
    }

    @Override
    public Identity tenant() {
        throw new BadAccessTokenException();
    }

    @Override
    public boolean valid() {
        return false;
    }

}
