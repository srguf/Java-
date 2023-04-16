package Exer_CircleAndCylinder;

public class Circle {
	private double radius;
	
	public Circle() {
		this.radius = 1;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
	
}
