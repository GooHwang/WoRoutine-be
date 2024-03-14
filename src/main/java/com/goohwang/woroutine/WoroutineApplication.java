package com.goohwang.woroutine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WoroutineApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoroutineApplication.class, args);
    }

}
