package knowledge;

import java.util.Arrays;

public class ArrayTools {
	public static void main(String[] args) {
		
		//boolean equals(int[] a,int[] b):判断两数是否相等
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		System.out.println();
		
		//String toString(int[] a):输出数组信息
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		//void fill(int[] a,int val):将指定值填充到数组之中
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		//void sort(int[] a):对数组进行排序
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));//方法为快排
		System.out.println();
		
		//int binarySearch(int[]  a,int key)：二分查找
		int[] arr3 = new int[] {-98,-34,2,34,54,66,79,105,210,333};
		int index = Arrays.binarySearch(arr3, 210);
		int index1 = Arrays.binarySearch(arr3, 311);
		System.out.println(index);
		System.out.println(index1);
		
	}
}
