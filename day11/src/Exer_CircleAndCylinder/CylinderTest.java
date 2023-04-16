package Exer_CircleAndCylinder;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
		System.out.println("Volume = " + cy.findVolume());
		System.out.println("Area = " + cy.findArea());
		System.out.println();
		
		Cylinder cy1 = new Cylinder();
		System.out.println("Radius = " + cy1.getRadius());
		System.out.println("Length = " + cy1.getLength());
		System.out.println("Volume = " + cy1.findVolume());
		System.out.println("Area = " + cy1.findArea());
		
	}
	
}
