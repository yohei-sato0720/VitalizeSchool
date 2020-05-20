package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.demo.controller","com.example.demo.services","com.example.demo.repositories","com.example.demo.entity"})
public class WgAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WgAppApplication.class, args);
	}

}
