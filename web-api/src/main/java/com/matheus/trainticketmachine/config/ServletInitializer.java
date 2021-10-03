package com.matheus.trainticketmachine.config;

import com.matheus.trainticketmachine.TrainticketmachineApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TrainticketmachineApplication.class);
	}

}
