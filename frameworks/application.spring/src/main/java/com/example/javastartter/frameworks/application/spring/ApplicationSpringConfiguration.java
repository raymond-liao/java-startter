package com.example.javastartter.frameworks.application.spring;

import com.example.javastartter.frameworks.domain.core.DefaultValueSinkFactory;
import com.example.javastartter.frameworks.domain.core.IdGenerator;
import com.example.javastartter.frameworks.domain.core.UuidBasedIdGenerator;
import com.example.javastartter.frameworks.domain.core.ValueSinkFactory;
import com.example.javastartter.frameworks.security.core.ContextLoader;
import com.example.javastartter.frameworks.security.core.ContextProvider;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
@EnableConfigurationProperties
@ComponentScan(basePackageClasses = ApplicationSpringConfiguration.class)
public class ApplicationSpringConfiguration {

    @Bean
    public static SpringMessageResolver messageResolver(MessageSource messageSource) {
        return new SpringMessageResolver(messageSource);
    }

    @Bean
    public ExceptionTranslator exceptionTranslator(List<ExceptionTranslatorConfigurer> configurers) {
        var translator = new ExceptionTranslator();
        configurers.forEach(configure -> configure.config(translator));
        return translator;
    }

    @Bean
    public ExceptionFormatter exceptionFormatter(MessageSource messageSource) {
        return new ExceptionFormatter(messageResolver(messageSource));
    }

    @Bean
    public ErrorAttributes errorAttributes(ExceptionFormatter exceptionFormatter) {
        return new ApplicationErrorAttributes(exceptionFormatter);
    }

    @Bean
    public ContextLoader contextLoader(ContextProvider contextProvider) {
        return new ContextLoader(contextProvider);
    }

    @Bean
    public IdGenerator idGenerator() {
        return new UuidBasedIdGenerator();
    }

    @Bean
    public ValueSinkFactory valueSinkFactory() {
        return new DefaultValueSinkFactory();
    }

}
