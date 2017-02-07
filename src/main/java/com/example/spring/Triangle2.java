package com.example.spring;

public class Triangle2 implements Shape{

	private Point a;
	private Point b;
	private Point c;
	
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
	
	public void init() {
		System.out.println("Initializing Bean userdef Triangle2");
	}
	
	public void mydestroy() {
		System.out.println("Destroy Bean userdef Triangle2");
	}
	
	@Override
	public String toString() {
		return "Triangle2 [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public void draw() {
		System.out.println(toString());
	}
}
