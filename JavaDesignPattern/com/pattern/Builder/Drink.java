package com.pattern.Builder;

public class Drink implements IItem {

	@Override
	public String name() {
		return "Drink";
	}

	@Override
	public float price() {
		return 2.0f;
	}

}
