package com.pattern.AbstractFactory2;

public class BikeFactory implements IFactory {

	@Override
	public IProduct produceProduct() {
		System.out.println("Producing a bike now!!!");
		Bike bike = new Bike();
		return bike;
	}

}
