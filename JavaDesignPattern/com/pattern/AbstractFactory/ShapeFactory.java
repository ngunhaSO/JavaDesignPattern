package com.pattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IColor getColor(String color) {
		return null;
	}

	@Override
	public IShape getShape(String shape) {
		if(shape == null) {
			return null;
		}
		if(shape.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		
		return null;
	}
	
	
}
