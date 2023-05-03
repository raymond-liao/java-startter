package com.example.javastartter.frameworks.test.web;

import com.example.javastartter.frameworks.context.core.SimpleUserContext;
import com.example.javastartter.frameworks.domain.core.Id;
import com.example.javastartter.frameworks.domain.core.Identity;
import com.example.javastartter.frameworks.security.core.*;

import java.util.Optional;

import static com.example.javastartter.frameworks.domain.core.Id.id;
import static com.example.javastartter.frameworks.domain.core.Identity.identity;

public final class GlobalTestContext {

    private static final GlobalTestContext INSTANCE = new GlobalTestContext();
    private Context context;

    public static Optional<Context> context() {
        return Optional.ofNullable(INSTANCE.context);
    }

    public static Optional<Id> token() {
        return context().map(Context::securityContext).map(SecurityContext::token);
    }

    public static void setup(GrantedAuthorities grantedAuthorities) {
        INSTANCE.context = new SimpleContext(new SimpleUserContext(userAccount(), user(), tenant()), new SimpleSecurityContext(id("tester-token-id"), grantedAuthorities));
    }

    public static void teardown() {
        INSTANCE.context = Context.ANONYMOUS;
    }

    public static Identity tenant() {
        return identity("highsoft", "Highsoft");
    }

    public static Identity user() {
        return identity("tester", "Tester");
    }

    public static Identity userAccount() {
        return identity("tester@highsoft", "Tester");
    }

}
