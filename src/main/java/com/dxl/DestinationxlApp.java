package com.dxl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author kishor.jadhav
 *
 */
@SpringBootApplication
public class DestinationxlApp extends SpringBootServletInitializer{

	private static final Logger log = LoggerFactory.getLogger(DestinationxlApp.class); 
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DestinationxlApp.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DestinationxlApp.class, args);
        log.info("************************DestinationxlApp Application Started**********");
    }

}
