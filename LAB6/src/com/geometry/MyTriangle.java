package com.geometry;

public class MyTriangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		// TODO Auto-generated constructor stub
		this.v1.setX(x1);
		this.v1.setY(y1);
		
		this.v2.setX(x2);
		this.v2.setY(y2);
		
		this.v3.setX(x3);
		this.v3.setY(y3);
	}
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		// TODO Auto-generated constructor stub
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String toStringV1 = "v1=(" + this.v1.getX() + "," + this.v1.getY() + "),";
		String toStringV2 = "v2=(" + this.v2.getX() + "," + this.v2.getY() + "),";
		String toStringV3 = "v3=(" + this.v3.getX() + "," + this.v3.getY() + ")";
		return "MyTriangle[" + toStringV1 + toStringV2 + toStringV3 + "]";
	}
	public double getPerimeter() {
		double v1v2 = this.v1.distance(v2);
		double v2v3 = this.v2.distance(v3);
		double v3v1 = this.v3.distance(v1);
		return v1v2 + v2v3 + v3v1;
	}
	public String getType() {
		double v1v2 = this.v1.distance(v2);
		double v2v3 = this.v2.distance(v3);
		double v3v1 = this.v3.distance(v1);
		if (v1v2 == v2v3 && v2v3 == v3v1) return "Equilateral";
		if (v1v2 == v2v3 || v1v2 == v3v1 || v2v3 == v3v1) return "Isosceles";
		return "Scalene";
	}
}
