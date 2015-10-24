package com.pattern.AbstractFactory2;

public class CarFactory implements IFactory {

	@Override
	public IProduct produceProduct() {
		System.out.println("Producing a car now!!!");
		Car car = new Car();
		return car;
	}

}
