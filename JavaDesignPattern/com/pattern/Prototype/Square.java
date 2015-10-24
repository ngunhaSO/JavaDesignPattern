package com.pattern.Prototype;

public class Square extends Shape {
	
	public Square() {
		super.setType("Square");
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}

}
