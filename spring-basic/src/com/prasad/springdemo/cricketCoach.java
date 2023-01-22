package com.prasad.springdemo;

public class cricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: This is a setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: This is a setter method - setTeam");
		this.team = team;
	}


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


	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
