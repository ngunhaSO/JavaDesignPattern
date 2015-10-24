package com.pattern.Bridge;

public class DrawCircle implements DrawAPI {

	@Override
	public void draw() {
		System.out.println("DrawingCircle implements DrawAPI");
	}

}
