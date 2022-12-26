package com.learning.chapter2.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.chapter2.Course;

public interface CourseSpringJPARepository extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);
    
}
