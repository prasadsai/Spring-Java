package com.prasad.springdemo;

public class FootballCoach implements Coach{
	private FortuneService fortuneService;
	FootballCoach(){
		
	}
	

	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play FIFA everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneRandom();
	}
	
	
	//add an init method
		public void doMyStartupStuff() {
			System.out.println("Footballoach: inside method doMyStartupStuff");
		}
		
		//add an destroy method
		public void doMyCleanupStuffDestroyed() {
			System.out.println("FootballCoach: inside method doMyCleanupStuffDestroyed");
		}
	
}
