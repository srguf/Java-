/*
运算符之二：赋值运算符
 =	+=	-=	*=	/=	%=


*/

class SetValueTest{
	public static void main(String[] args){
		//赋值符号：=
		int i1 = 10;
		int j1 = 10;

		int i2,j2;
			//连续赋值
		i2 = j2 = 10;

		int i3 = 10,j3 = 20;
			//共用int型
		
		/*************************************************/
		int num1 = 10;
		num1 += 2;
			//num1 = num1 + 2;
		System.out.println(num1);
			//12
		
		int num2 = 12;
		num2 %= 5;
			//num2 = num2 % 5;
		System.out.println(num2);
			//2
		
		//特殊的：
		short s1 = 10;
			//s1 = s1 + 2;(编译失败)
		s1 += 2;
			//不会改变变量本身的数据类型！！！！！！！！！！！
		System.out.println(s1);

		//练习：
		int nn = 10;
		nn += (nn++) + (++nn);
			//nn = nn + (nn++) + (++nn);
		System.out.println(nn);
			//32

	}
}



















