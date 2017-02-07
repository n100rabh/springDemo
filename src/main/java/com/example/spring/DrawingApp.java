package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {

//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); //here it was in SpringDemo folder
//		Triangle triangle = (Triangle)factory.getBean("triangle");
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //moved the file to classPath by putting in src
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		context.registerShutdownHook();  //to clean up(close context) after main ends usually required for Desktop Apps, for WebApps aut cleanup done by Spring
		Shape triangle = (Shape)context.getBean("triangle");
		triangle.draw();
		
		Shape triangle2 = (Shape)context.getBean("triangle2");
		triangle2.draw();
		
		Shape triangle3 = (Shape)context.getBean("triangle3");
		triangle3.draw();
		
		Shape triangle4 = (Shape)context.getBean("triangle4");
		triangle4.draw();
		
		TriangleContainer triangleContainer = (TriangleContainer)context.getBean("shape");
		System.out.println(triangleContainer.toString());
		
		Shape triangle5 = (Shape)context.getBean("triangle5");
		triangle5.draw();
		
		Shape triangle6 = (Shape)context.getBean("triangle6");
		triangle6.draw();
		
		Shape triangle7 = (Shape)context.getBean("triangle7");
		triangle7.draw();
		
		Shape triangle8 = (Shape)context.getBean("triangle8");
		triangle8.draw();
		
		Shape circle = (Shape) context.getBean("circle");
		circle.draw();
		
		Shape circle2 = (Shape) context.getBean("circle2");
		circle2.draw();
		
		System.out.println(context.getMessage("greeting", null, "Default greeting", null));
	}

}
