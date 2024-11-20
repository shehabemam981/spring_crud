package com.example.crud.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@Configuration
public class ConfLanguage {
    @Value("${spring.messages.basename}")
    private String baseName;
    @Value("${spring.messages.local-default}")
    private String localDefault;

    @Bean("messages")
    public ResourceBundleMessageSource resourceBundleMessageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setUseCodeAsDefaultMessage(true);
        source.setDefaultEncoding("UTF-8");
        source.setBasename(baseName);
        return source;
    }

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver acceptHeaderLocaleResolver = new AcceptHeaderLocaleResolver();
        acceptHeaderLocaleResolver.setDefaultLocale(new Locale(localDefault));
    return acceptHeaderLocaleResolver;
    }


}
