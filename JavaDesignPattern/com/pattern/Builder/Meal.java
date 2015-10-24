package com.pattern.Builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<IItem> items = new ArrayList<IItem>();
	
	public void addItem(IItem item) {
		items.add(item);
	}
	
	public float getPrice() {
		float cost = 0.0f;
		for(IItem item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void getReceipt() {
		for(IItem item : items) {
			System.out.println(item.name());
		}
		
		System.out.println("Total: " + getPrice());
	}
}
