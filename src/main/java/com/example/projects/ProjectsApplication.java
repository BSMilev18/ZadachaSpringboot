package com.example.projects;

import Model.Numbers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectsApplication.class, args);
        Numbers numbers = new Numbers();
        System.out.println(numbers.getNumbers());
    }
}
