package com.tns.circle;

public class Circle {
	
	private String color;
	private float radius;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [color=" + color + ", radius=" + radius + "]";
	}

}
