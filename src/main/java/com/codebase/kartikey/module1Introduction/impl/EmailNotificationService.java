package com.codebase.kartikey.module1Introduction.impl;

import com.codebase.kartikey.module1Introduction.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Email sending..."+message);
    }

}
