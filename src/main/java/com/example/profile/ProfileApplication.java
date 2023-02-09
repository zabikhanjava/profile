package com.example.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileApplication {

	@Autowired
	String what;
	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);

	}
	public void pop {
		System.out.println(what);
	}
}
