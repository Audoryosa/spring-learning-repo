package com.audriuskumpis;

public class BadFortune implements FortuneService{

	@Override
	public String getFortune() {
		return "Not such a good day awaits us";
	}

}
