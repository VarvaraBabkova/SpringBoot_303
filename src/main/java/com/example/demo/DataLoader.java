package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Course course;
        course = new Course("Astrophysics", "Tyson", "Just a course about stars", 3);
        repository.save(course);

        course = new Course("Calculus", "Carol Henley", "rate of Change of the Rate of Change", 3);
        repository.save(course);

        course = new Course("Freshman English", "Pegram", "Learn your language children", 3);
        repository.save(course);
    }
}
