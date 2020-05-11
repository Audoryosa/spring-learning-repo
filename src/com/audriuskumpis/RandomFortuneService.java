package com.audriuskumpis;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{
	
	private String[] data = {
			"Homo homini lupus est",
			"Hanibal ante portas",
			"Veni vidi vici",
			"Per aspera ad astra"
	};

	@Override
	public String getFortune() {
		Random ranomIndex = new Random();
		int index = ranomIndex.nextInt(data.length);
		
		return data[index];
	}

}
