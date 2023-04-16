/*
whlie循环的使用：
一、循环结构的4个要素
1.初始化条件
2.循环条件 ---boolean类型++
3.循环体
4.迭代条件

二、whlie的循环结构

(1)
whlie( (2) ){
	(3); 
	(4);
} 

执行过程：1-2-3-4-  2-3-4-  2-3-4........-2-3-4-  2-over;

说明：
1.写whlie循环不能丢了(4)迭代条件，否则可能导致死循环
	//算法的有限性
2.for循环和whlie循环时可以相互转换的
	//区别：for循环和while循环的初始化条件部分作用范围不同
3.
*/


class WhileTest{
	public static void main(String[] args){
		
		//遍历100以内所有偶数,输出并计数
		int i = 0;
		while( i <= 100){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
		System.out.println(i);
			//i= 101
	}
}