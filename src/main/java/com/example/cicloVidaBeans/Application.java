package com.example.cicloVidaBeans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	CommandLineRunner ejecutame(){
		return p ->
		{
			System.out.println("Hola desde la clase secundaria");
		};
	}

	@Bean
	CommandLineRunner ejecutame2(){
		return p ->
		{
			System.out.println("Soy la tercera clase");
		};
	}

	@PostConstruct
	public void llamada(){
		System.out.println("Hola desde la clase inicial");
	}

}
