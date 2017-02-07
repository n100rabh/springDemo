package com.example.spring;

import java.util.List;

public class Triangle3 implements Shape{

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Triangle3 [points=" + points + "]";
	}

	public void draw() {
		System.out.println(toString());
	}
}
