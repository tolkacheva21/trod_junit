package com.example.trod_junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TrodJunitApplication {
	public static void main(String[] args) {
		SpringApplication.run(TrodJunitApplication.class, args);
	}
}
