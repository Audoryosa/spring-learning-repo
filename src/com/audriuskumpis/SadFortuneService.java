package com.audriuskumpis;

public class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "This makes me sad";
	}

}
