/*
题目：从键盘读入数个不确定整数，并判断读入的正数和负数的个数，输入0时结束程序

说明：
1.不在循环条件部分限制次数的结构：for( ; ; )  或  while(ture)
结束循环有几种方式？
	一、在循环条件中返回false
	二、在循环体中，执行break；
*/

import java.util.Scanner;

class ForWhileTest{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
	
		int positive = 0;
		int negative = 0;
		
		while(true){    //for( ; ; ){     （for这样写）
			int number = scan.nextInt();
			if(number > 0){
				positive += 1;
			}else if(number < 0){
				negative += 1;
			}else{
				break;
			}
		}
	System.out.println("有" + positive +"个正数");
	System.out.println("有" + negative +"个负数");

	}
}