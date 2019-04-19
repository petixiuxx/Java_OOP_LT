package com.geometry;

public class Rectangle extends Shape {
	protected double width;
	protected double length;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		width = length = 1.0;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.length;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.width + this.length) * 2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A Rectangle with width=" + this.width + " and length=" + this.length + ",which is a subclass of" + super.toString();
	}
}
