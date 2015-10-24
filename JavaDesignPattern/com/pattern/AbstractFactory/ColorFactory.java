package com.pattern.AbstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public IColor getColor(String color) {
		if(color == null) {
			return null;
		}
		
		if(color.equalsIgnoreCase("Red")){
			return new Red();
		}
		else if(color.equalsIgnoreCase("Blue")) {
			return new Blue();
		}
		
		return null;
	}

	@Override
	public IShape getShape(String shape) {
		return null;
	}

}
