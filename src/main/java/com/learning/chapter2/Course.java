package com.learning.chapter2;

import lombok.Data;

@Data
public class Course {

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    private long id;
    private String name;
    private String author;

}
