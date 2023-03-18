package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoVotingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoVotingAppApplication.class, args);
		System.out.println("Welcome to Voting App!");
	}

}
