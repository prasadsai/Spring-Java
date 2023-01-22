package com.prasad.springdemo;

import org.springframework.stereotype.Component;

//@Component("theTennisCoach")
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Hit 100 Tennis balls";
	}

	@Override
	public String getResults() {
		// TODO Auto-generated method stub
		return null;
	}

}
