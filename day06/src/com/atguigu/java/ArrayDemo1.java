package com.atguigu.java;
/*
键盘读入学生成绩，找出最高分，并评级
	成绩>=最高分 - 10 等级A
	成绩>=最高分 - 20 等级B
	成绩>=最高分 - 30 等级C
	成绩 其余        等级D
 */

import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入学生人数");
		int number = scan.nextInt();
		
		//创建数组
		int[] arr = new int[number];
		
		//存放信息
		for(int i = 0; i < number; i++) {
			System.out.println("请输入第" + (i + 1) +"名的分数");
			//int scores = scan.nextInt();
			//arr[i] = scores;
			arr[i] = scan.nextInt();
		}
		
		//找出最高成绩
		int maxScore = 0;
		for(int i = 0; i < number/*(scores.length)*/; i++) {
			if(arr[i] > maxScore) {
				maxScore = arr[i];
			}
		}
		System.out.println("最高分数为：" + maxScore);
		
		//得出等级
		for(int i = 0; i < number; i++) {
			if(maxScore - arr[i] >= 30) {
				System.out.println(arr[i] + " D");
			}else if(maxScore - arr[i] >= 20){
				System.out.println(arr[i] + " C");	
			}else if(maxScore - arr[i] >= 10) {
				System.out.println(arr[i] + " B");
			}else {
				System.out.println(arr[i] + " A");
			}
		}
		scan.close();
	}
}


