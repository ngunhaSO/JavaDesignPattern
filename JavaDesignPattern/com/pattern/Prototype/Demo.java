package com.pattern.Prototype;

public class Demo {
	public static void main(String[] args) {
		ShapeCache.saveCache();
		
		Shape cloneShape1 = (Shape) ShapeCache.getShape("1");
		System.out.println(cloneShape1.getType());
		
		Shape cloneShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println(cloneShape2.getType());
	}
}
