package com.geometry;

public class MyPoint {
	private int x = 0;
	private int y = 0;
	public MyPoint(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int[] getXY() {
		int[] XY = {this.x, this.y};
		return XY;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String point = "(" + this.x + "," + this.y + ")";
		return point;
	}
	public double distance(int x, int y) {
		double disX = Math.pow( Math.abs(x - getX()), 2);
		double disY = Math.pow( Math.abs(y - getY()), 2);
		return Math.sqrt(disX + disY);
	}
	public double distance(MyPoint another) {
		double disX = Math.pow( Math.abs(another.getX() - getX()), 2);
		double disY = Math.pow( Math.abs(another.getY()  - getY()), 2);
		return Math.sqrt(disX + disY);
	}
	public double distance() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
}
