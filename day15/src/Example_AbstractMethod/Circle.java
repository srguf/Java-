package Example_AbstractMethod;

public class Circle extends GeometricObject{
	private double radius;

	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return Math.PI * this.radius * this.radius;
	}
	
}
