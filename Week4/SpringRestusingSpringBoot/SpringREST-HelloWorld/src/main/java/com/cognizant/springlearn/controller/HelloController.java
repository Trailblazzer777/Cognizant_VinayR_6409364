package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks this class as a REST controller
public class HelloController {

    // Create a logger instance for this class
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello") // Maps HTTP GET requests to the /hello endpoint
    public String sayHello() {
        // Log the start of the method execution
        LOGGER.info("START sayHello()");

        // Hardcoded string to be returned as the response
        String message = "Hello World!!";

        // Log the end of the method execution
        LOGGER.info("END sayHello()");

        return message;
    }
}  