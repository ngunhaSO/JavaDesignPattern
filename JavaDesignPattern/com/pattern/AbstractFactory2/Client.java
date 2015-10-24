package com.pattern.AbstractFactory2;

public class Client {
	public IFactory requestProduct(String clientChoice) {
		if(clientChoice == null) {
			return null;
		}
		if(clientChoice.equalsIgnoreCase("Bike")){
			return new BikeFactory();
		}
		else if(clientChoice.equalsIgnoreCase("Car")){
			return new CarFactory();
		}
		return null;
	}
}
