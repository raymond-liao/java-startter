package com.example.javastartter.frameworks.test.web;

import jakarta.annotation.Resource;
import com.example.javastartter.frameworks.context.core.UserContext;
import com.example.javastartter.frameworks.security.core.Context;
import com.example.javastartter.frameworks.security.core.ContextProvider;
import com.example.javastartter.frameworks.security.core.GrantedAuthorities;
import com.example.javastartter.frameworks.security.core.SecurityContext;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static com.example.javastartter.frameworks.domain.core.Id.id;
import static com.example.javastartter.frameworks.domain.core.Identity.identity;
import static org.assertj.core.api.Assertions.assertThat;

@WithGrantedAuthorities({"f3", "f4"})
public class AuthorityOverriddenTest extends IntegrationTest {

    private @Resource ContextProvider contextProvider;

    @Test
    void should_be_able_to_override_authorities_of_current_user() {
        Optional<Context> context = GlobalTestContext.token().flatMap(contextProvider::get);
        assertThat(context.map(Context::userContext).map(UserContext::userAccount)).hasValue(identity("tester@highsoft", "Tester"));
        assertThat(context.map(Context::userContext).map(UserContext::user)).hasValue(identity("tester", "Tester"));
        assertThat(context.map(Context::userContext).map(UserContext::tenant)).hasValue(identity("highsoft", "Highsoft"));
        assertThat(context.map(Context::securityContext).map(SecurityContext::token)).hasValue(id("tester-token-id"));
        assertThat(context.map(Context::securityContext).map(SecurityContext::grantedAuthorities)).hasValue(GrantedAuthorities.of("f3", "f4"));
    }

}
