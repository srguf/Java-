/*
运算符之五：位运算符
<<	>>	>>>(不论正负前面一定补0)	&	|	^(异或)	~（包括符号位所有位取反）

1.为运算符操作的都是整形的数据
2.<<在一定范围内，每向左移一位 = * 2
  >>在一定范围内，每向右移一位 = / 2

面试题：最高效的方式的计算2 * 8？   (2 << 3 或 8>>1)
*/

class BitTest{
	public static void main(String[] args){
		
		//<<	>>运算符
		int i = 21;
			//0001 0101
		System.out.println("i << 2:" + (i << 2) );
			//84( 0101 0100 )
			//i = 21 * 2^2(因为左移两位)
		System.out.println("i << 3:" + (i << 3) );
			//168
			//i = 21 * 2^3

		//使用位运算符^
		int num1 = 10;
		int num2 = 20;
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
			//num1 == (num1 ^ num2) ^ num2
	}
}















