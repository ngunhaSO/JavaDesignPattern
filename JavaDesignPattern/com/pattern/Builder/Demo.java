package com.pattern.Builder;

public class Demo {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		Meal customerOneMeal = builder.prepareMeal1();
		System.out.println("Customer 1 receipt: ");
		customerOneMeal.getReceipt();
		System.out.println("");
		Meal customerTwoMeal = builder.prepareMeal2();
		System.out.println("Customer 2 receipt: ");
		customerTwoMeal.getReceipt();
	}
}
