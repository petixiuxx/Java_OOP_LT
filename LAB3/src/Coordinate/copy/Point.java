package Coordinate.copy;

public class Point {
	private String name;
	private float x;
	private float y;
	
	public Point(String name, float x, float y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public void getPoint() {
		System.out.println("The point name " + this.name);
		System.out.println("The point x coordinate " + this.x);
		System.out.println("The point y coordinate " + this.y);
	}
}
