package com.example.spring5recipeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class Spring5RecipeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5RecipeAppApplication.class, args);
	}

}
