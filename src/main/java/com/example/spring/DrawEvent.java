package com.example.spring;

import org.springframework.context.ApplicationEvent;

//Custom event
public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DrawEvent []";
	}
}
