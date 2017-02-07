package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {
	
	private Point center;

	public Point getCenter() {
		return center;
	}
	
	@Required	//makes sure that center is set in bean otherwise it will through BeanInitializerException
	@Autowired  //first looks for type Point, if it finds multiple beans with same type then looks for name of field "center"
	@Qualifier("center") // looks for a bean with qualifier center and inject that
	public void setCenter(Point center) { 
		this.center = center;
	}
	
	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}
	
	public void draw() {
		System.out.println(this);
	}
}
