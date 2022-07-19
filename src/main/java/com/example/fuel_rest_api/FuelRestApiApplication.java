package com.example.fuel_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class FuelRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuelRestApiApplication.class, args);
    }

}
