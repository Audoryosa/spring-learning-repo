package com.audriuskumpis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		System.out.println("email: " + coach.getEmail() + 
				", team: " + coach.getTeam());
		
		context.close();
	}
}
