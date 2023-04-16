package com.atguigu.java;

public class yanghui_project {
	public static void main(String[] args) {
		//声明初始化二维数组
		int[][] yangHui = new int[10][];
		//数组赋值
		for(int i = 0;i < yangHui.length;i++) {
			yangHui[i] = new int[i + 1];
			for(int j = 0;j < i + 1;j++) {
				//yangHui[i][0] = 1;
				if(j == i || j == 0) {
					yangHui[i][j] = 1;
					continue;
				}
				yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];	
				
			}
		}
		//输出数组
		for (int i = 0; i < yangHui.length; i++) {
			for(int n = 0; n < yangHui.length - i;n++) {
				System.out.print(" ");
			}
			for (int j = 0; j < yangHui[i].length; j++) {
					System.out.print(" " + yangHui[i][j]);
			}
			System.out.println();
		}
	}
}
