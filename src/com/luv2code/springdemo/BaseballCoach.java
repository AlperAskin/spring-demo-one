package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	
	
	private FortuneService FortuneService;
	
	
	
	public BaseballCoach(FortuneService theFortuneService) {
		FortuneService = theFortuneService;
	}

	
	
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
	//use my FortuneService to get a fortune	
		
		return FortuneService.getFortune();
	}
}
