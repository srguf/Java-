package Exer_EqualsToString;

public class Circle extends GeometricObject{
	private double radius;

	public Circle() {
		super();
		this.radius = 1.0;
//		this.color = "white";
//		this.weight = 1.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius,String color,double weight) {
		this(radius);
		this.color = color;
		this.weight = weight;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
		
	public double findArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return this.color.equals(c.color) 
					&& this.weight == c.weight
					&& this.radius == c.radius;
		}else {
			return false;
		}
	}
	public boolean radiusEquals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			return this.radius == c.radius;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}




