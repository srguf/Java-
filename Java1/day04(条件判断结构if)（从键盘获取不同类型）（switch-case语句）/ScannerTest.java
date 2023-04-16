/*
如何从键盘获取不同类型的变量：需要Scanner类

具体实现步骤：
1.导包：import java.util.Scanner;  (util:功用；utility：多功能工具包)
2.Scanner的实例化：Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法( next()/nextXxx() )，来获取指定类型的变量
	//对于char型的获取，Scanner没有提供相关方法
		//         获取字符串种字符：串名 + .charAt();  (例：gender.charAt(0);（指获取第一个字符）)！！！！！
*/


import java.util.Scanner;
	//1.导包

class ScannerTest{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
			//2实例化

		System.out.println("请输入整型：");
		int num = scan.nextInt();
			//3.调用Scanner类的相关方法
		System.out.println(num);

		System.out.println("请输入字符串：");
		String string = scan.next();
		System.out.println(string);

		System.out.println("请输入浮点型：");
		double fudian = scan.nextDouble();
		System.out.println(fudian);

		System.out.println("请输入布尔型：（true or false）");
		boolean boer = scan.nextBoolean();
		System.out.println(boer);


	}
}











