package com.Service3.LibraryProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.Service3.LibraryProject"})
public class LibraryProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibraryProjectApplication.class, args);

	}

}
