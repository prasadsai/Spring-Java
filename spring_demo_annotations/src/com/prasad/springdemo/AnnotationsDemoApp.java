package com.prasad.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
//		Coach theCoach = context.getBean("theTennisCoach",Coach.class);
//		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach theCoach = context.getBean("footballCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
