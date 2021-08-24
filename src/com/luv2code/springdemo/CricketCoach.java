package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService FortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
		
	}
	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method- setFortuneService");
		FortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practice fas bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		
		return FortuneService.getFortune();
	}

}
