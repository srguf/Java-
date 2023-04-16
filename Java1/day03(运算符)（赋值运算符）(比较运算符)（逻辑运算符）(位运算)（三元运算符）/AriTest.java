/*
运算符之一：算术运算符
+	-	+	- 	* 	/ 	%	(前)++	(后)++ 	 (前)-- 	 (后)--

*/


class AriTest{
	public static void main(String[] args){
		//除号：/
		int num1 = 12;
		int num2 = 5;
		
		int result1 = num1 / num2;
		System.out.println(result1);
			//2	(int型不保留小数点)

		int result2 = num1 / num2 * num2;
		System.out.println(result2);	
			//12	(错误，因为先结算了num1 / num2)
			//10	(正确)

		double result3 = num1 / num2;
		System.out.println(result3);
			//2.0 	( num1 / num2 结果记为int型)（理解：先得出num1 / num2的值，然后再赋值给result3）

		double result4 = (double)num1 / num2;
		System.out.println(result4);
			//2.4	(正确)

		
		
		//%：取余运算（取模运算）（开发中常用于判断能否被除尽的情况）
			//结果符号与被模数相同
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//2
		
		int m2 = -12;
		int n2 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//-2
		
		int m3 = 12;
		int n3 = -5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//2

		int m4 = -12;
		int n4 = -5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//-2

		
		//(前)++：先自增1，后运算
		//(后)++：先运算，后自增1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);
			//11, 11

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);
			//11, 10

		//注意点：
		short s1 = 10;
			//s1 = s1 + 1;(编译失败)
			//s1 = (short)(s1 + 1);(正确)
		s1++;
			//自增不会改变本身变量的数据
		System.out.println(s1);
			//11
		 //问题：
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);
			//-128( 0111 1111 + 1 = 1000 0000 (-128) ) ( 1111 1111 = -127;规定-128等于1000 0000)
		

		//(前)--：先自减1，后运算
		//(后)--：先运算，后自减1



/*
例题：
数字153情况下，显示如下：
百位数：1
十位数：5
个位数：3
*/

		int num = 187;
		int bai = num / 100;
		int shi = num / 10 % 10;
		int ge = num % 10;
		System.out.println("数字为187的情况下" );
		System.out.println("百位数 = " + bai);
		System.out.println("十位数 = " + shi);
		System.out.println("个位数 = " + ge);

		
	}

}





























