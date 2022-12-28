package com.prasad.springdemo;

public class BaseballCoach implements Coach{
	
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my forthuneService to get a fortune
		return fortuneService.getFortune();
	}


	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
