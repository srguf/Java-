package Exer_CircleAndCylinder;

public class Cylinder extends Circle{
	private double length;
	
	public Cylinder() {
		this.length = 1;
	}

	public Cylinder(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double findVolume() {
		return super.findArea() * getLength();
	}
	
	@Override
	public double findArea() {
		return 2 * super.findArea() + (Math.PI * 2 * super.getRadius()) * length;
	}
	
}
