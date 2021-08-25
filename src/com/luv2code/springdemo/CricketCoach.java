package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService FortuneService;
	
	
	
	private String emailAddress;
	private String team;
	
	
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
		
	}
	
	
	// setter method
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method- setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method- setTeam");
		this.team = team;
	}


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
