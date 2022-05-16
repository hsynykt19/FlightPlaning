package com.flightplaning;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
//@OpenAPIDefinition(info = @Info(title = "FlightPlaning API", version = "2.0", description = "FlightPlaning Information"))

public class FlightPlaningApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightPlaningApplication.class, args);
    }

}
