package com.prasad.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will have good luck for your family";
	}

	public String[] arrS = {"Luck","Lucky","LuckyStar","Luckest"};
	Random rand = new Random();
	
	
	@Override
	public String getFortuneRandom() {
		// TODO Auto-generated method stub
		return arrS[rand.nextInt(arrS.length)];
	}

}
