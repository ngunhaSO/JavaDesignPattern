package com.pattern.Facade;

public class Demo {
	public static void main(String[] args) {
		ShapeMaker maker = new ShapeMaker();
		maker.drawRectangle();
		maker.drawSquare();
	}
}
