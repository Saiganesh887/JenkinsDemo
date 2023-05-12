package com.example.jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsApplication {
	public static Logger logger = (Logger) LoggerFactory.getLogger(JenkinsApplication.class);

	public void init(){
		logger.info("Application started");
	}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
