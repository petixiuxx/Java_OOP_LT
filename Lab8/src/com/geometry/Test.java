package com.geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle(5.5, "RED", false);
//		System.out.println(s1);
//		System.out.println(s1.getArea());
//		System.out.println(s1.getPerimeter());
//		System.out.println(s1.getColor());
//		System.out.println(s1.isFilled());
//		System.out.println(((Circle) s1).getRadius());

		Circle c1 = (Circle)s1;
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

//		Shape s2 = new Shape();

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false)
	}

}
