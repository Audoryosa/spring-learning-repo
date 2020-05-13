package com.audriuskumpis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.audriuskumpis")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// define bean for a sad fortune
	@Bean
	public FortuneService sadFortuneService() { // name will be an id
		return new SadFortuneService();
	}
	
	// define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService()); // injecting fortune service dependency
	}
}
