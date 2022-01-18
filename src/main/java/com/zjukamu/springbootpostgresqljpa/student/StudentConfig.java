package com.zjukamu.springbootpostgresqljpa.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student wanjiru = new Student(
                    "Wanjiru",
                    "wanjiru@gmail.com",
                    LocalDate.of(2002, APRIL, 7)
            );

            Student kamau = new Student(
                    "Kamau",
                    "kamau@gmail.com",
                    LocalDate.of(2008, APRIL, 7)
            );

            repository.saveAll(
                    List.of(wanjiru, kamau)
            );
        };
    }
}
