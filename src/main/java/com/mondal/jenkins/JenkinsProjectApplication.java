package com.mondal.jenkins;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
		System.out.println("Application started");
	}

}
