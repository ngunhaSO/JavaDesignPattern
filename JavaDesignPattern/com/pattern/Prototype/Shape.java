package com.pattern.Prototype;

public abstract class Shape implements Cloneable {
	private String id;
	private String type;

	abstract void draw();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Shape clone() {
		Shape clone = null;
		try {
			clone = (Shape) super.clone();
			clone.setId(id);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
