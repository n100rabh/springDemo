package com.example.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component //using this we don't need to define bean in XML file. Spring scans the base-package to create bean.
//@Service	Same as Component but give extra info that this is a Service
//@Repository Same as Component but give extra info that this is a Data object
//@Controller Same as Component but give extra info that this is a Controller object (C in MVC)
//These adds documentation
public class Circle2 implements Shape, ApplicationEventPublisherAware {
	
	private Point center;
	
	@Autowired	//Using MessageSource to get text from properties file, bean is auto injected from xml file where properties filename is mentioned
	//This is an added advantage of using ApplicationContext over BeanFactory
	private MessageSource messageSource;
	
	//This is an added advantage of using ApplicationContext over BeanFactory, let Spring pass us the Event Publisher
	private ApplicationEventPublisher publisher;

	public Point getCenter() {
		return center;
	}
	
	@Resource(name="pointC")  //injecting pointC bean into Circle2 using JSR-250 Annotation
	public void setCenter(Point center) { 
		this.center = center;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@PostConstruct //initialization using JSR-250 Annotation
	public void initialize() {
		System.out.println("Initializing Bean userdef Circle2");
	}
	
	@PreDestroy	//destroying using JSR-250 Annotation
	public void destroying() {
		System.out.println("Destroy Bean userdef Circle2");
	}
	
	@Override
	public String toString() {
		return "Circle2 [center=" + center + "]";
	}

	public void draw() {
		System.out.println(toString());
		System.out.println(messageSource.getMessage("drawing.circle", null, "kewl", null));
		System.out.println(messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "kewl", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	 //When a class implements ApplicationEventPublisherAware, Spring provides publisher using which we can publish events
	//if u think about it, the publisher is actually ApplicationContext since it implements ApplicationEventPublisher
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
