package com.caltech.solutions.user.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class UserManagerApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserManagerApiApplication.class, args);
	}

}
