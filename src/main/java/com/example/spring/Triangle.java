package com.example.spring;

public class Triangle implements Shape{

	private String type;
	private Integer height;

	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(Integer height) {
		this.height = height;
	}

	public Triangle(String type, Integer height) {
		super();
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getHeight() {
		return height;
	}

	public void draw() {
		System.out.println("Draws " + type + " Triangle of height " + height);
	}
}
