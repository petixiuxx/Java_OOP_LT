package com.geometry;

public abstract class Shape {
	protected String color;
	protected boolean filled;
	public Shape() {
		// TODO Auto-generated constructor stub
		color = "green";
		filled = true;
	}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public boolean isFilled() {
		return filled;
	}
	@Override
	public String toString() {
		String fill = this.filled ? "filled" : "Not filled";
		// TODO Auto-generated method stub
		return "A Shape with color of " + this.color + " and " + fill;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}
