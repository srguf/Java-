/*
嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环

2.外层循环：循环结构B
   内层循环：循环结构A

3.说明
(1)内层循环结构遍历一遍，只相当于外层循环循环体执行了一次 
(2)假设外层循环需要执行m次，内层循环需要执行n次，此时内层循环体一共执行了：m * n次

4.技巧：
外层循环控制行数，内层循环控制列数


附加的：
1.	System.currentTimeMillis();
	作用：获取1970-01-01   00：00：00到现在的毫秒数(long型)

2.	Math.sqrt(i)
	作用：类，取i的根号下

*/

class ForForTest{
	public static void main(String[] args){

		/*例题：输出  i                j
		*                    0               0+1
		**                  1               1+1
		***                 2               2+1         
		****               3               3+1         
		*****              4               4+1           
		*/

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < i+1; j++){
			System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();



/***************************************************/
/*输出
     *         5
    * *       4
   * * *      3
  * * * *    2
 * * * * *  1
  * * * *    2   
   * * *     3
    * *       4
     *        5
*/
		//上半部分
		for(int i = 0; i < 5; i++){
			//输出"_"
			for(int n = 0; n < 5 - i; n++){
				System.out.print(" ");
			}
			//输出："*_"
			for(int j = 0; j < i + 1; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	
		//下半部分
		 for(int i = 0; i < 4; i++){
			//输出"_"
			for(int n = 0; n < i + 2; n++){
				System.out.print(" ");
			}
			//输出："*_"
			for(int j = 0; j < 4 - i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();


	
/***********************************************************/
		/*九九乘法表
		1 * 1 = 1
		2 * 1 = 2   2 * 2 = 4
		.......
		9 * 1 = 9.....9 * 9 = 81
		
		*/
		for(int i = 1; i < 10; i++){
			for(int j = 1; j < i + 1; j++){
				int num = i * j;
				System.out.print( i + "*" + j + "="  + num + "   ");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println(); 

/*******************************************************************************/

		long start = System.currentTimeMillis();
		//获取1970-01-01   00：00：00到现在的毫秒数(long型)
		


		//100以内所有质数输出
		int flag = 0;
		//方法二：去掉上面的
		int count = 0;
/*label*/	for(int i = 2; i < 100; i++){
			flag = 0;
			for(int j = 2; j <= Math.sqrt(i); j++){
					//优化二：对本身是质数的自然数是有效的
				if( i % j == 0){
					flag++;
					break;
					//方法二：去掉flag和break，改为continue label；
						//优化1，只对本身非质数的自然数有效
				}
			}
			if(flag == 0){
				System.out.println( i );
			count++;
			}
			
		}
		
		long start1 = System.currentTimeMillis();
			//获取1970-01-01   00：00：00到现在的毫秒数(long型)
		long time = start1 - start;
		System.out.println("个数为" + count);
		System.out.println( "程序所花费的时间为：" + time + "毫秒");
			//不优化：12ms
			//优化一：9ms
			//优化一 + 二：0ms


		/*   注*  
		若是100000
		不优化：17110ms
		优化一：1546ms
		优化一 + 二：13ms
		我的电脑1 + 2：502ms
		*/
	}
}











