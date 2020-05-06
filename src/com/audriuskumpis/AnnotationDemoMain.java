package com.audriuskumpis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach;
		
		coach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		coach.setFortuneService(new BadFortune());
		
		System.out.println(coach.getFortune());
		
		context.close();

	}

}
