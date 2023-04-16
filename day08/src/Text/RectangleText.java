package Text;

/*
 * 打印一个10 * 8矩形，在main中调用该方法
 * 
 * 计算其矩形面积，并将其作为方法的返回值
 * 
 * 修改程序，在method方法中提供m和n两个参数，方法中打印一个m * n的矩形，
 * 并计算其面积，且作为返回值。在main中调用方法，接受面积并打印
 * 
 * 
 */

import java.util.Scanner;

public class RectangleText {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rectangle re = new Rectangle();	
		
		re.print();
		System.out.println("矩形的面积为：" + re.a());
		System.out.println("/******************/");
		/********************************************/
		System.out.println("请您设计矩阵的长和宽");
		re.lenth = scan.nextInt();
		re.width = scan.nextInt();
		re.print();
		System.out.println("矩形的面积为：" + re.a());
		
		scan.close();
	}
}

class Rectangle{
	int lenth = 8;
	int width = 10;
	int area;
	
	public void print() {
		for(int i = 0;i < lenth;i++) {
			for(int j = 0;j < width;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public int a() {
		area = lenth * width;
		return area;
	}
	
}






