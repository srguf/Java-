package Example_StaticMethod;

/*
 * 封装的工具类
 * 
 */

import java.util.Arrays;

public class ArrayUtil {
	
	//求数组的最大值
	public static int getMax(int[] arr) {
		int max = -100000;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	//求数组的最小值
	
	public static int getMin(int[] arr) {
		int min = 100000;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	//求数组的总和
	
	public static int getSum(int[] arr) {
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//求数组的平均值
	public static int getAvg(int[] arr) {
		int avg = (int)Math.round(getSum(arr) / arr.length);
		return avg;
	}
	
	//反转数组
	public static void reverse(int[] arr) {
		for(int i = 0;i < arr.length / 2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	
	//复制数组
	public static int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length]; 
		for(int i = 0;i < arr.length;i++) {
			arr1[i] = arr[i];
		}
		return null;
	}
	
	//数组排序
	public static void sort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++) {/*外层表示循环几大轮*/
			
			for(int j = 0; j < arr.length - 1 - i;j++) {
				
				if(arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
					
					//错误的:
//					swap(arr[j],arr[j+1]);
					//正确的
					swap(arr,j,j+1);
				}
			}
			
		}
	}
	
	//错误的：交换数组中指定两个位置元素的值
	public void swap(int i,int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	//正确的：交换数组中指定两个位置元素的值!!!!!!!!!!!!!!!
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//遍历数组
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	//查找指定元素
	public static int getIndex(int[] arr,int destination/*目的地*/) {
		int i;
		for(i = 0;i < arr.length;i++) {
			if(arr[i] == destination) {
				return i;
			}
		}
		return -1;//返回一个负数，表示没有找到
	}
	
	
	
	
}
