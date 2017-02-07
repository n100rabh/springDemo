package com.example.spring;

public class Triangle4 implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Triangle4() {
	}
	
	public Triangle4(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	@Override
	public String toString() {
		return "Triangle4 [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

	public void draw() {
		System.out.println(toString());
	}
}
