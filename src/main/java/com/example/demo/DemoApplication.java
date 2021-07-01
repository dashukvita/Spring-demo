package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE/Integer.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE + Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);
	}

}
