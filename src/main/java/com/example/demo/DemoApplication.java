package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World");
		System.out.println("Welcome to India");
		System.out.println("practice branch");
		System.out.println("merge practice");
		System.out.println("2 nd branch");
		Example example=new Example();
		int result=example.add(5,10);
		System.out.println(result);
		System.out.println("new content is added at line 19 in master branch");
	}

}
