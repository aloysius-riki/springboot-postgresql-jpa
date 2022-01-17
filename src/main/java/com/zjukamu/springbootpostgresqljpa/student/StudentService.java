package com.zjukamu.springbootpostgresqljpa.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Bob",
                        "bob@gmail.com",
                        LocalDate.of(2000, Month.FEBRUARY, 6),
                        21

                )
        );
    }
}
