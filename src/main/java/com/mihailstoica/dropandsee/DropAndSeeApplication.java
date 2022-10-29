package com.mihailstoica.dropandsee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DropAndSeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DropAndSeeApplication.class, args);
    }

}
