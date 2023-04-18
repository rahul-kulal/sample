package com.jbk.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootwithoutDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwithoutDbApplication.class, args);
		System.out.println( "hello");
	}

}
