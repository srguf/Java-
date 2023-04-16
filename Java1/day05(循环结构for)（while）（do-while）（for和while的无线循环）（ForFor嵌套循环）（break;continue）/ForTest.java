/*
For循环结构的使用
一、循环结构的4个要素
1.初始化条件
2.循环条件 ---boolean类型++
3.循环体
4.迭代条件

二、for循环的结构
for( (1) ; (2) ; (4) ){
	(3)
}

执行过程：1-2-3-4   -2-3-4  .....  2-3-4   -2-over;
*/

import java.util.Scanner;


class ForTest{
	public static void main(String[] args){
			
		int num = 1;
		for(System.out.print('a'); num <= 3; System.out.print('c'),num++){
			System.out.print('b');
		}
		System.out.println();
		System.out.println();
			//abc bc bc 
		

/************************************************************************************/
		//例题：遍历100以内的偶数，并且记录个数且输出所有偶数的和

		System.out.println("例题：遍历100以内的偶数");
		int sum = 0;
		int count = 0;
		for(int i /*（此i仅在for循环内生效）*/ = 0; i <= 100; i++){
			if( i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("cuont(偶数的个数) = " + count);
		System.out.println("sum(所有偶数的和) = " + sum);
		

		//编写程序1到150，并在每行打印一值，另外每三行的倍数行打印“foo”5的倍数打印“biz”，7的倍数打印“baz”
		
		System.out.println();
		System.out.println();
		System.out.println("编写程序1到150，并在每行打印一值，另外每三行的倍数行打印“foo”5的倍数打印“biz”，7的倍数打印“baz”");
		for(int i = 0; i < 150; i++){
			System.out.print(i + "  ");
			if(i % 3 == 0){
				System.out.print("foo ");
			}
			if(i % 5 == 0){
				System.out.print("biz ");
			}
			if(i % 7 == 0){
				System.out.print("baz ");
				System.out.println();
			}else{
				System.out.println();
			}
		}
	}
}		




//输入两个正整数m和n，求最大公约数和最小公倍数


class ForTest1{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("输入两个正整数m和n，求最大公约数和最小公倍数");
		System.out.println("请输入整数m");
		int m = scan.nextInt();
		System.out.println("请输入整数n");
		int n = scan.nextInt();

		int min = (m < n)? m : n;
		int max = (m > n)? m : n;

		for(int i = min; i <= m && i<=n; i--){
			if(m % i == 0 && n % i == 0){
				System.out.println("m和n的最大公约数为" + i);
				break;
			}
		}
		for(int i = max; i <= m * n; i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("m和n的最小公倍数数为" + i);
				break;
			}
		}
	}
}















