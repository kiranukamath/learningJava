package com.learning.chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.chapter2.jdbc.JDBCRepository;
import com.learning.chapter2.jpa.CourseSpringJPARepository;
import com.learning.chapter2.jpa.JPARepository;

@Component
public class DataCommandLineRunner {//implements CommandLineRunner {

    // @Autowired
    // private JDBCRepository repository;

    // @Autowired
    // private JPARepository repository;

    @Autowired
    private CourseSpringJPARepository repository;

    /* @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "learn aws", "author1"));
        repository.save(new Course(2, "learn spring", "author1"));
        repository.save(new Course(3, "learn java", "author1"));
        repository.save(new Course(4, "learn datajpa", "author1"));
        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println("Author courses"+repository.findByAuthor("author1"));
    } */

}
