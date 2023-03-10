package com.prasad.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Do it! " + fortuneService.getFortune();
	}
	@Override
	public String getRandomFortune() {
		return fortuneService.getFortuneRandom();
	}

	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add an destroy method
	public void doMyCleanupStuffDestroyed() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffDestroyed");
	}
}
