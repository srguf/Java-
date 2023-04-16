/*
String类型变量的使用
1.String属于引用数据类型（class），翻译为：字符串
2.声明String类型变量时，使用一对""
3.String可以和8（7种+boolean）种数据基本数据类型做运算，且运算只能是连接运算：+
4.运算结果为String类型
*/
class StringText{
	public static void main(String[] args){
	
		String s1 = "Hello World!";
		System.out.println(s1);
		String s2 = "a";

		char c = 'a';
		System.out.println(c);

		/***********************************************************************/
		
		int number = 1001;
		String numberStr = "学号:";
		String info = numberStr + number;// +：连接运算（在前后任意有String型时，其余情况为运算加）
		boolean b1 = true;
		String info1 = info + b1;// +：连接运算
		System.out.println(info1);

		/***********************************************************************/
		
		//练习
		char c1 = 'a';//a = 97, A = 65
		int num = 10;
		String str = "hello";
		
		System.out.println(c1 + num + str);
			//107hello
		System.out.println(c1 + str + num);
			//ahello10
		System.out.println(c1 + (num + str) );
			//a10hello
		System.out.println( (c1 + num) + str);
			//107hello
		System.out.println(str + num + c1);
			//hello10a

		
		//练习2
		//输出*	*（中间为Tap键）(\t)
		System.out.println("*	*");
			//*	*
		System.out.println('*' + '	' + '*');
			//93
		System.out.println('*' + '\t' + '*');
			//93
		System.out.println('*' + "\t" + "*");
			//*	*
		System.out.println('*' + '\t' + "*");
			//51*
		System.out.println('*' + ('\t' + "*") );
			//*	*
		System.out.println("*" + "\t" + "*");
			//*	*
		
	}
}



















