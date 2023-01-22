package com.prasad.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 15K miles";
	}

	@Override
	public String getResults() {
		// TODO Auto-generated method stub
		return null;
	}

}
