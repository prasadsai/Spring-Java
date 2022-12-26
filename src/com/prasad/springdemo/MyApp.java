package com.prasad.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating the object
		//instead of BaseballCoach we can use Coach which is the interface.
		//The method is defined in the Coach by is declared in the BaseballCoach.
//		Coach theCoach = new BaseballCoach();
		
		Coach theCoach = new TrackCoach();
		
		//using the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
