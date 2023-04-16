package Text;
/*
 * 使用简单数组
 * (1)创建一个名为ArreyExer的类，
 * 在main方法中声明array1和array2的两个变量，为int{}的数组
 * (2)使用大括号{}，把array1初始化为8个素数：2，3，5，7，11，13，17，19。
 * (3)显示array1的内容
 * (4)赋值array2变量等于array1，修改array2中的偶索引元素，
 * 使其等于索引值（如array[0] = 0,array[2] = 2;)打印出array1
 * 
 * 思考array1和array2是什么关系？(都指向了堆空间中唯一的数组实体)
 * 拓展，修改题目，实现array2对array1数组的复制
 * 数组的反转，遍历
 * 
 * 小知识：判断String类型内容是否相等，调用equals
 * 例如arr[i]内查找aa，aa == arr[i];
 * 	  aa.equals(arr[i])
 */
import java.util.Scanner;

public class ArreyUse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] array1,array2,array3;
		
		array1 = new int[]{2,3,5,7,11,13,17,19};
		//显示array1的内容
		System.out.println("array1=\t");
		for(int i = 0;i < array1.length;i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.println();
		
		//赋值array2变量等于array1
		array2 = array1;//拷贝首地址就相当于拷贝了整个数组
			//堆中的地址赋给了栈中的array2(不能叫做数组的复制)
		//复制array1
		array3 = new int[array1.length];
		for(int i = 0;i < array1.length;i++){
			array3[i] = array1[i];
		}
		
		//修改array2中的偶索引元素
		int n = 0;
		while(n < array2.length) {
			array2[n] = n;
			n += 2;
		}
		
		//打印出array1(同时也是array2)
		System.out.println("array1(修改后)=\t");
		for(int i = 0;i < array1.length;i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.println();
		//打印array3
		System.out.println("array=3\t");
		for(int i = 0;i < array1.length;i++) {
			System.out.print(array3[i] + "\t");
		}
		System.out.println();
		
		//数组的反转
//		for(int i = 0;i < array3.length(错误！！！);i++) {
//			int temp = array3[i];
//			array3[i] = array3[array3.length - i - 1];
//			array3[array3.length - i - 1] = temp;
//		}
			//错误！！！因为i交换了前半部分成功，但后半部分又交换回去了！！！！
		for(int i = 0;i < array3.length / 2;i++) {
			int temp = array3[i];
			array3[i] = array3[array3.length - i - 1];
			array3[array3.length - i - 1] = temp;
		}
		//输出
		System.out.println("array3(反转后)");
		for(int i = 0;i < array3.length;i++) {
			System.out.print(array3[i] + "\t");
		}
		System.out.println();
		
		//反转方法二：
		for(int i = 0,j = array3.length - 1;i < j;i++,j--) {
			int temp = array3[i];
			array3[i] = array3[j];
			array3[j] = temp;
		}
		//输出
		System.out.println("array3(二次反转后)");
		for(int i = 0;i < array3.length;i++) {
			System.out.print(array3[i] + "\t");
		}		
		System.out.println();
		
		
		//查找(或搜索)
		//线性查找：(遍历判断)
		//折半查找(二分查找)(前提：所要查找的数组必须有序)：
		int head = 0;
		int end = array3.length - 1;
		int a = 0;
		
		System.out.println("请输入想要查找的数(20以内的素数)");
		int num = scan.nextInt(); 
		if(num > 0 && num <= 20) {
			
			boolean flag = false;
			while(head <= end) {
				int middle = (head + end) / 2;
				if(num == array3[middle]) {
					flag = true;
					a = middle;
					break;
				}else if(num < array3[middle]) {
					end = middle - 1;//(比较过middle，所以减一加一为了破出循环)
				}else{//num > array3[middle]
					head = middle + 1;
				}
			}
			
			if(flag == false) {
				System.out.println("您查找的数不存在");
			}else {
				System.out.println(num + "在数组中序号为" + a);
			}
			
		}else {
			System.out.println("您输入的数字有误");
		}
		scan.close();
	}
}






