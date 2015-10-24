package com.pattern.AbstractFactory;

public class Demo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		IShape shape = shapeFactory.getShape("RECTANGLE");
		shape.draw();
		
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		IColor color = colorFactory.getColor("RED");
		color.fill();
	}
}
