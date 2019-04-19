package com.geometry;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {}
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	public Circle(double radius, String color) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public double getRadius() {
		return radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return this.radius * Math.PI;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle[radius="+this.radius + "," + "color=" + this.color + "]";
	}
}
