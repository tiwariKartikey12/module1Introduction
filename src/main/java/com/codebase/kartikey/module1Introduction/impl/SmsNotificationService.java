package com.codebase.kartikey.module1Introduction.impl;

import com.codebase.kartikey.module1Introduction.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sms sending...."+message);
    }

}
