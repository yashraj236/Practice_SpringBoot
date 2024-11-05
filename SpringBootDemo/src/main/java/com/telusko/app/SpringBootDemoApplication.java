package com.telusko.app;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
	ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);
	Laptop lap = context.getBean(Laptop.class);
	lap.compile();

	}

}
