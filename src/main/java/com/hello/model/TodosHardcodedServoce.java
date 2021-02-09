package com.hello.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodosHardcodedServoce {
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	static {
	todos.add(new Todo(++idCounter, "in28minutes", "Learn to Dance", false));
	todos.add(new Todo(++idCounter, "in28minutes", "Learn any thing", false));
	todos.add(new Todo(++idCounter, "in28minutes", "Learn football", false));

	}
	public List<Todo> findAll() {
	return todos;
	}
}
