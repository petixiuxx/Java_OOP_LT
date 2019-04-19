package com.geometry;

public class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		// TODO Auto-generated constructor stub
		super();
		height = 1.0;
	}
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cylinder: Subclass of " + super.toString() + " height=" + height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea() * height;
	}
}
