package com.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hello.model.Todo;
import com.hello.model.TodosHardcodedServoce;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodosResources {
	@Autowired
	private TodosHardcodedServoce todoService ;
	
	@GetMapping("/user/{userName}/todos")
	public List<Todo> getAllTodos(@PathVariable String userName){
		
	return todoService.findAll() ;
	}

}
