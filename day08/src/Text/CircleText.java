package Text;

/*
 * 利用面向对象的设计方法，设计Circle计算圆的面积
 * 
 * 
 * Math.PI = Π = 3.1415926...
 */

import java.util.Scanner;

public class CircleText {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle cir = new Circle();
		
		System.out.println("请输入圆的半径");
		cir.radius = scan.nextDouble();
		System.out.println("圆的面积为：\n" + cir.findArea());
		
		
		scan.close();
	}
}


//圆
class Circle{
	double radius;
	
	public double findArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
}