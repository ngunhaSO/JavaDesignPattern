package com.pattern.Builder;

public class Burger implements IItem {

	@Override
	public String name() {
		return "Burger";
	}

	@Override
	public float price() {
		return 6.0f;
	}
	
}
