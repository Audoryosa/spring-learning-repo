package com.audriuskumpis;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim accros the lake and don't drown";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
