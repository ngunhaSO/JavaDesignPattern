package com.pattern.Bridge;

public class Demo {
	public static void main(String[] args) {
		Shape shape = new Circle(new DrawCircle());
		shape.drawShape("circle");
		System.out.println();
		Shape shape2 = new Rectangle(new DrawRectangle());
		shape2.drawShape("rectangle");
	}
}
