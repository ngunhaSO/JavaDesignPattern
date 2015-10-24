package com.pattern.Bridge;

public class Rectangle extends Shape {

	public Rectangle(DrawAPI drawAPI) {
		super(drawAPI);
	}
	
	@Override
	public void drawShape(String shapeType) {
		System.out.println("shape: " + shapeType);
		drawAPI.draw();
	}

}
