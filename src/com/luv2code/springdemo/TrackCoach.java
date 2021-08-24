package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService FortuneService;
	
	public TrackCoach() {
		
	}
	
	
	public TrackCoach(com.luv2code.springdemo.FortuneService fortuneService) {
		super();
		FortuneService = fortuneService;
	}
	
	
	
	

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + FortuneService.getFortune();
	}

}
