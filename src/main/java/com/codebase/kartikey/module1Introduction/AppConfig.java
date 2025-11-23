package com.codebase.kartikey.module1Introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService paymentService() {
        //more logic
        return new PaymentService();
    }
}
