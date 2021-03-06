package com.ranganath.employ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EmployApplication extends SpringBootServletInitializer {	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmployApplication.class);
    }	
	
	
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/Niftem");    
		 SpringApplication.run(EmployApplication.class, args);	
		// PropertyConfigurator.configure("log4j.properties");
	}
}
