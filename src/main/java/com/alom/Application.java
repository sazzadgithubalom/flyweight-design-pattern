package com.alom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.event.EventListener;

import lombok.extern.log4j.Log4j2;


/**
 * <p>Main method to start application.</p>
 * 
 * @author sazzad.alom
 * @since 1.0.0
 */
@Log4j2
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args){
		SpringApplication.run(Application.class);	
	}
	
	@EventListener(ApplicationStartedEvent.class)
	public void onStart() {
		log.info("Application Started Successfully.");
	}
}