package com.audriuskumpis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoMain {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		Coach coach2 = context.getBean("tennisCoach", Coach.class);
		
		// singletons should print 'true'
		System.out.println(coach == coach2);

		// close context
		context.close();
	}

}
