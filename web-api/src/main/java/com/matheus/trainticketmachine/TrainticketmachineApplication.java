package com.matheus.trainticketmachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TrainticketmachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainticketmachineApplication.class, args);
	}

}
