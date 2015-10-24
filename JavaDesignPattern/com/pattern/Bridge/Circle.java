package com.pattern.Bridge;

public class Circle extends Shape {

	public Circle(DrawAPI drawAPI) {
		super(drawAPI);
	}

	@Override
	public void drawShape(String shapeType) {
		System.out.println("shape: " + shapeType);
		drawAPI.draw();
	}

}
