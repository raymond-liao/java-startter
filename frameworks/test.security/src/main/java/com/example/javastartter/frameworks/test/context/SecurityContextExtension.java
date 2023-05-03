package com.example.javastartter.frameworks.test.context;

import com.example.javastartter.frameworks.security.core.GlobalSecurityContextResetter;
import com.example.javastartter.frameworks.security.core.GrantedAuthorities;
import com.example.javastartter.frameworks.security.core.SimpleSecurityContext;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
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
