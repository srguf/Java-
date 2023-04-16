package com.atguigu.java;
/*int型数组，
 * 10元素，赋随机二位数不重复，
 * 求最大、最小、平均数、所有数之和、并输出
 */

public class Text {
	public static void main(String[] args) {
		int[] arr = new int[10];
		double m = (Math.random() * 90) + 10;
		arr[0] = (int)m;
		int max = 0 ;
		int min = 100;
		int sum = 0;
		double avgnum = 0;
		label :for(int i = 1;i < 10;i++) {
				double number = (Math.random() * 90) + 10;
				while(true) {
					if(number == arr[i]) {
						i--;
						continue label;
					}else {
						arr[i] = (int)number;
						break;
					}
				}
			}
		for(int i = 0;i < 10;i++) {
			System.out.println(arr[i]);
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			sum += arr[i];
		}
		avgnum = sum / arr.length;
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("平均数为" + avgnum);
		System.out.println("arr之和为" + sum);
	}
}
