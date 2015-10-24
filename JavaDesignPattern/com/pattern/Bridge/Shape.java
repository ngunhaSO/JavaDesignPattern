package com.pattern.Bridge;

public abstract class Shape {
	DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public void drawShape(String shapeType) {
		System.out.println("Drawing a shape..." );
	}
}
