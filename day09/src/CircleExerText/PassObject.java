package CircleExerText;

/*
 * 定义一个类PassObject，在类中定义一个方法printArea（），
 * 该方法的定义如下：public void printArea(Circle c,int time)
 * 
 * 在printArea方法中打印输出1到time之间的每个整数半径值，以及对应的面积
 * 例如。times为5，则输出半径为1，2，3，4，5，以及对应的圆的面积
 * 
 * 在main方法中调用printArea(),调用完毕后输出当前半径值，程序运行结果如图所示
 * 
 */

import java.util.Scanner;

public class PassObject {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PassObject PJ = new PassObject();
		Circle c = new Circle();
		
		System.out.println("请输入time值");
		int time = (int)scan.nextDouble();
		
		PJ.printArea(c,time);
		
		scan.close();
	}

	public void printArea(Circle c,int time) {
		System.out.println("Radius\t\tAreas");
		for(int i = 0;i < time;i++) {
			c.radius = i + 1;
			System.out.println(i + 1 + "\t\t" + c.findArea());	
		}
		System.out.println("now radius is " + ((int)c.radius + 1));
	}
	
	
}
