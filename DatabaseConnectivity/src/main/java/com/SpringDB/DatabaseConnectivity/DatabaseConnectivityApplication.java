package com.SpringDB.DatabaseConnectivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.SpringDB.DatabaseConnectivity.model")
public class DatabaseConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseConnectivityApplication.class, args);
	}

}
