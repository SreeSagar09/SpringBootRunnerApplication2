package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRunnerApplication2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunnerApplication2Application.class, args);
		
		System.out.println("From main method in SpringBootRunnerApplication2Application class.");
	}

}
