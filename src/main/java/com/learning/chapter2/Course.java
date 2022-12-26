package com.learning.chapter2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Course {

    public Course(){

    }

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Id
    private long id;
    private String name;
    private String author;

}
