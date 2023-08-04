package com.newdev.processing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"controller","Service","configcls","repository"})
public class ProcessingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProcessingApplication.class, args);
    }

}
