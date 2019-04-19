package com.geometry;

public class Square extends Rectangle {
	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(double side, String color, boolean filled) {
		super();
		// TODO Auto-generated constructor stub
		this.width = this.length = side;
		this.color = color;
		this.filled = filled;
	}

	public Square(double side) {
		super();
		this.width = this.length = side;
		// TODO Auto-generated constructor stub
	}
	public double getSide() {
		return this.width; 
	}
	public void setSide(double side) {
		this.width = this.length = side;
	}
	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		this.width = side;
	}
	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		this.length = side;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString(); 
	}
}
