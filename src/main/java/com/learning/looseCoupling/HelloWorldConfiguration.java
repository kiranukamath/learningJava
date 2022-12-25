package com.learning.looseCoupling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String firstline, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Kamath";
    }

    @Bean
    public Person person(){
        return new Person("kiran", 25);
    }

    @Bean
    public Address address(){
        return new Address("Vijayanagar", "bangalore");
    }
    
}
