package com.pattern.AbstractFactory2;

public class Demo {
	public static void main(String[] args) {
		Client client = new Client();
		IFactory bikeFactory = client.requestProduct("bike");
		IProduct bikeProduct = bikeFactory.produceProduct();
		bikeProduct.productType();
		
		IFactory carFactory = client.requestProduct("car");
		IProduct carProduct = carFactory.produceProduct();
		carProduct.productType();
	}
}
