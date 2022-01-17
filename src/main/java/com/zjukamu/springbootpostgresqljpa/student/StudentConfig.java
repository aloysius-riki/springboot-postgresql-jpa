package com.zjukamu.springbootpostgresqljpa.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student bob = new Student(
                    "Bob",
                    "bob@gmail.com",
                    LocalDate.of(2002, APRIL, 7),
                    21
            );

            Student kamau = new Student(
                    "Kamau",
                    "kamau@gmail.com",
                    LocalDate.of(2008, APRIL, 7),
                    21
            );

            repository.saveAll(
                    List.of(bob, kamau)
            );
        };
    }
}
