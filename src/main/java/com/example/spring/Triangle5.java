package com.example.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle5 implements Shape, ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public Triangle5() {
	}
	
	public Triangle5(Point pointA, Point pointB, Point pointC) {
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
		return "Triangle5 [pointA=" + pointA + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	public void setBeanName(String beanName) {
		System.out.println("BeanName is: " + beanName);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean kewl Triangle5");
	}

	public void destroy() throws Exception {
		System.out.println("Destroyed Bean kewl Triangle5");
	}
	
	public void init() {
		System.out.println("Initializing Bean userdef Triangle5");
	}
	
	public void mydestroy() {
		System.out.println("Destroy Bean userdef Triangle5");
	}

	public void draw() {
		System.out.println(toString());
	}
}
