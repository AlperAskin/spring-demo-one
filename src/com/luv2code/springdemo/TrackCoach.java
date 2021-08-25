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
	
	//add an init method
		public void doMyStartupStuff() {
			System.out.println("TrackCoach: inside method doMyStartupStuff");
		}
	
	// add a destroy method
		public void doMyCleanupStuffYoYo() {
			System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
		}

}
