package com.learning.chapter3.todo;

import java.time.LocalDate;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Todo {

    private int id;
    private String username;
    @Size(min = 10,message="Enter atleast 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;
    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    

}
