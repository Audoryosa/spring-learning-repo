package com.audriuskumpis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoMain {

	public static void main(String[] args) {
		// when using .xml config file
		//ClassPathXmlApplicationContext context = new 
		//ClassPathXmlApplicationContext("applicationContext.xml");
		
		// when using config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getFortune());
		
		context.close();

	}

}
