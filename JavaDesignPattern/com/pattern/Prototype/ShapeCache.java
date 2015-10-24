package com.pattern.Prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	public static void saveCache() {
		Rectangle rect = new Rectangle();
		rect.setId("1");
		
		Square square = new Square();
		square.setId("2");
		
		shapeMap.put(rect.getId(), rect);
		shapeMap.put(square.getId(), square);
	}
}
