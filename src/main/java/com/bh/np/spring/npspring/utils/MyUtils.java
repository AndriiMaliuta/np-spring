package com.bh.np.spring.npspring.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MyUtils {

    @Autowired
    private static MessageSource messageSource;

    public MyUtils(MessageSource messageSource) {
        MyUtils.messageSource = messageSource;
    }

    public static String getMessage(String messageKey, Object... args) {

        return messageSource.getMessage(messageKey, args, LocaleContextHolder.getLocale());
    }
}
