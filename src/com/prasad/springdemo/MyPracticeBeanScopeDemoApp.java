package com.prasad.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPracticeBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//check if these are the same beans
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}


// First all the constructors and setters will be called 
	//and then init-method and destroy methods will be called with internal processing in betweek

