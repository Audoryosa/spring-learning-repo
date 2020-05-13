package com.audriuskumpis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		context.close();
	}
}
