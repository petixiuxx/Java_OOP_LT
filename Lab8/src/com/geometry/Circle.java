package com.geometry;

public class Circle extends Shape {
	protected double radius;
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super();
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius, 2); 
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A Circle with radius=" + this.radius + "which is a subclass of" + super.toString();
	}
}
