package com.derin.test.testProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		System.out.println("hello world!");
		some();
	}
	public static String some() {
		System.out.println("hello ome!");
		return "Hello some";
	}
}
