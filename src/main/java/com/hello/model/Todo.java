package com.hello.model;

public class Todo {
	private int id ;
	private String username;
	private String description;
    private Boolean isDone ;
	
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsDone() {
		return isDone;
	}
	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
	}
	public Todo(int id, String username, String description, Boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.isDone = isDone;
	}
	public Todo() {
		super();
	}
 
    
}
