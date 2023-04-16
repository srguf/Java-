/*
do-while循环的使用

一、循环结构的4个要素
1.初始化条件
2.循环条件 ---boolean类型++
3.循环体
4.迭代条件

二、do-while循环结构：
(1)
do{
	(3);
	(4); 
}while( (2) );

执行过程：1-3-4-2   -3-4-2  -3-4-2  ....   3-4-2-over;

说明：
1.do-whlie循环至少会执行一次！！！！！！！！！
2.开发中，使用for循环和while循环更多一些，较少使用do-while.

*/


class DoWhileTest{
	public static void main(String[] args){

		//遍历100以内的偶数，并计算所有数目的和及偶数个数
		int i = 0;
		int sum = 0;
		int count = 0;
		do{
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
			i++;
		}while(i <= 100);
		System.out.println("所有偶数的和为" + sum);
		System.out.println("一共有" + count + "个偶数");
	}
}













