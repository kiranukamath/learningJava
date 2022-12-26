package com.learning.chapter2;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;
    
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
          new Course(1,"Learn Spring","author1"),
          new Course(2,"Learn Java 17","author2"),
          new Course(3,"learn DS","author3") 
        );
    }

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration getCurrencyServiceConfiguration(){
        return currencyServiceConfiguration;
    }
}
