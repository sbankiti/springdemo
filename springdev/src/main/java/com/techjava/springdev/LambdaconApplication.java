package com.techjava.springdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class LambdaconApplication {

	public static void main(String[] args) {SpringApplication.run(LambdaconApplication.class, args);}

	@Bean
	public Function<String, String> reverse(){
		return (input)-> new StringBuilder(input).reverse().toString();
	}

}
