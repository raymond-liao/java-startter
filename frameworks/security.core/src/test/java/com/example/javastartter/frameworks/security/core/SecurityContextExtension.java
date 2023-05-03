package com.example.javastartter.frameworks.security.core;

import org.junit.jupiter.api.extension.*;
import org.junit.platform.commons.util.AnnotationUtils;

import static com.example.javastartter.frameworks.domain.core.Id.id;

public class SecurityContextExtension implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) {
        var annotation = AnnotationUtils.findAnnotation(context.getRequiredTestClass(), WithSecurityContext.class);
        annotation.ifPresent(x -> GlobalSecurityContextResetter.reset(new SimpleSecurityContext(id("simple"), GrantedAuthorities.of(x.grantedAuthorities()))));
    }

    @Override
    public void afterEach(ExtensionContext context) {
        GlobalSecurityContextResetter.clear();
    }

}
