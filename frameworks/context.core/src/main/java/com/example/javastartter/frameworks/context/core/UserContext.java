package com.example.javastartter.frameworks.context.core;

import com.example.javastartter.frameworks.domain.core.Identity;

import static com.example.javastartter.frameworks.domain.core.Identity.identity;

public interface UserContext {

    Identity ANONYMOUS_IDENTITY = identity("anonymous", "Anonymous");
    Identity SYSTEM_IDENTITY = identity("system", "System");
    UserContext ANONYMOUS = new SimpleUserContext(ANONYMOUS_IDENTITY, ANONYMOUS_IDENTITY, ANONYMOUS_IDENTITY);
    UserContext INVALID = new InvalidUserContext();
    UserContext SYSTEM = new SimpleUserContext(SYSTEM_IDENTITY, SYSTEM_IDENTITY, SYSTEM_IDENTITY);

    Identity userAccount();

    Identity user();

    Identity tenant();

    boolean valid();

}
