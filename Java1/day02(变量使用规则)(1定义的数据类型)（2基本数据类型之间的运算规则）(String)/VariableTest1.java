/*
Java定义的数据类型

一. 变量按照数据类型来分：

	基本数值类型：
		数值型：	整形： byte  \  short \ int \ long
				浮点型： float \ double 
		字符型： char
		布尔型： boolean

	引用数据类型：
		类：(class)        <- 字符串在这里
		接口：(interface)
		数组：(array)
二.变量在类中的位置：
		成员变量 vs 局部变量	
*/





class VariableTest1{
	public static void main(String[] args){
		
		//  1.整形：byte（1字节=8bit） \  short(字节) \ int(4字节) \ long(8字节)
			
		//byte范围： -128~127。
		
			//通常使用int型。
		short s1 = 128;
		int i1 = 1234;
		
			//声明long型变量，必须以“l”或“L”结尾。
		long l1 = 34346464L;
		System.out.print("l1 = ");
		System.out.println( l1);
		System.out.println("l1 = " + l1);
		
		
		//  2.浮点型：float（4byte） \  double(8byte)
			
		//float表示范围比long还大。
		
			//定义float类型变量时，变量要以"f"或"F"结尾。
		float f1 = 12.3F;
		System.out.println(f1);
			//通常定义浮点型变量时，使用double型。


		//  3.字符型：char（1字符 = 2字节）
			//定义char型变量，通常使用一对‘ ’,内部只能有一个字符。
		char c1 = 'A';
		//c1 = 'AB'; (编译不通过)
		System.out.println(c1);

		char c2 = '1';
		//char c3 = '中'；（错误：汉字占两个字节）
		char c4 = 'の';
		System.out.println(c2);
		//System.out.println(c3);
		System.out.println(c4);

		
   		//换行符 /n；
		//unicode表    ANSI：美国信息交换标准码（American Standard coda for information interchange）
		
		// 4.布尔型：boolean
			//只能取两个值之一：true \ false
			//常常在条件判断、循环结构中使用
		boolean bb1 = true;
		System.out.println(bb1);

		
	}
}












