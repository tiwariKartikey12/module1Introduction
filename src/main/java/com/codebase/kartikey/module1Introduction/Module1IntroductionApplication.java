package com.codebase.kartikey.module1Introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1IntroductionApplication implements CommandLineRunner {

	final NotificationService notificationService; //dependency injection

	public Module1IntroductionApplication(@Qualifier("emailNotif") NotificationService notificationService) {
		this.notificationService = notificationService; // constructor DI //// Preferred way of DI
	}

	public static void main(String[] args) {
		SpringApplication.run(Module1IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		notificationService.send("hello");
	}

}
