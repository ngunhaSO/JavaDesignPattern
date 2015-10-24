package com.pattern.Builder;

public class MealBuilder {
	
	public Meal prepareMeal1() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal prepareMeal2() {
		Meal meal = new Meal();
		meal.addItem(new VegieBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
