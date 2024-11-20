package com.example.crud.service;

import com.example.crud.model.BundleMessages;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class LocalTranslatorMessages {
    private static ResourceBundleMessageSource resourceBundleMessageSource;

    LocalTranslatorMessages(@Qualifier("messages") ResourceBundleMessageSource resourceBundleMessageSource) {
        LocalTranslatorMessages.resourceBundleMessageSource = resourceBundleMessageSource;
    }

    public static BundleMessages getMessagesinArandEn(String code) {
        return new BundleMessages(resourceBundleMessageSource.getMessage(code, null, new Locale("ar")), resourceBundleMessageSource.getMessage(code, null, new Locale("en")));
    }

}
