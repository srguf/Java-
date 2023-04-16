package Exer;

/*
 * 构造器的使用练习
 * 
 */

public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle t = new TriAngle();
		
		t.setBase(2);
		t.setHeight(6);
		System.out.println("area = " + t.area());
		System.out.println("/*************/");
		
		TriAngle t1 = new TriAngle(2,3);
		
		t1.print();
		System.out.println("area = " + t1.area());
		
	}
	
}


class TriAngle{
	private int base;
	private int height;
	
	TriAngle(){
		
	}
	
	TriAngle(int b,int h) {
		base = b;
		height = h;
	}
	
	void setBase(int b) {
		base = b;
	}
	
	void setHeight(int h) {
		height = h;
	}
	
	void print() {
		System.out.println("base = " + base + ",height = " + height);
	}
	
	int area() {
		return base * height / 2; 
	}
	
}

