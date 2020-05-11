package com.audriuskumpis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("tennisCoach")
@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	public TennisCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Hit ball to a wall";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

//	@Autowired
//	@Qualifier("randomFortuneService")
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	

}
