package com.prasad.springdemo;

public class cricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//no-arg constructor
	public cricketCoach() {
		System.out.println("CricketCoach: This is a no-arg constructor");
	}
	
	
	//getter method
//	public FortuneService getFortuneService() {
//		return fortuneService;
//	}

	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: This is a setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Practice cricket worldcup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	

	
}
