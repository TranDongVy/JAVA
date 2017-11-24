package com.trandongvy.classj2ee.opps.passbymethod.passbyobject;

public class Swap {

	public static void main(String[] args) {

		Circle c1 = new Circle(1);
		Circle c2 = new Circle(2);
		System.out.println("swap 1");
		swap1(c1, c2);
		System.out.println("after swap: c1 = " + c1.radius + " and c2 = " + c2.radius);

		System.out.println("swap 2");
		swap2(c1,c2);
		System.out.println("after swap: c1 = " + c1.radius + " and c2 = " + c2.radius);

	}

	public static void swap1(Circle a, Circle b) {
		Circle temp = a;
		a = b;
		b = temp;
		
	}

	public static void swap2(Circle x, Circle y) {
		double temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}

}
