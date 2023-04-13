package com.test_warehouse;

public class items {
	
	private int id;
    private String name;
    private String color;
    private String description;
    
	public items(int id, String name, String color, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.color = color;
	}

	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}


