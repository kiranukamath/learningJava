package com.learning.chapter3.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "kiran", "Learn Spring", LocalDate.now().plusDays(3), false));
        todos.add(new Todo(2, "kiran", "Learn springboot", LocalDate.now().plusDays(3), false));
        todos.add(new Todo(3, "kiran", "Learn java17", LocalDate.now().plusDays(3), false));
        todos.add(new Todo(4, "kiran", "Learn react", LocalDate.now().plusDays(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        int todosCount = todos.size();
        Todo todo = new Todo(++todosCount, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    
	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
