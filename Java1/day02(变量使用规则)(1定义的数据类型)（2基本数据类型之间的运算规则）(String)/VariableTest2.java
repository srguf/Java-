/*
基本数据类型之间的运算规则：

前提：7种数据变量类型，不包含boolean类型。

1.自动类型提升：
	当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
	byte 、char 、 short --> int --> long --> float --> double
	特别的：当byte 、 char 、 short三种类型的变量做运算时，结果为int型
		整形常量默认为int型
		浮点类型常量默认为double型

2.强制类型转换：
	自动类型提升的逆运算。


说明：此时的容量大小表示数的范围的大小。例如float容量大于long
*/




class VariableTest2{
	public static void main(String[] args){
		
		System.out.println("自动类型提升");
		byte b1 = 2;
		int i1 = 129;
			//byte b2 = b1 + i1;   （编译不通过）
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);
		System.out.println(l1);

		float f = b1 + i1;
		System.out.println(f);

		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);

		/**************************特别的***************************/
		char c1 = 'a';//97
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
			//107

		byte b2 = 12;
		int i5 = c1 + b2;
		System.out.println(i5);
			//byte 、char 、 short运算结果为int型


		
		
			//强制类型转换
		System.out.println("强制类型转换");
		double d2 = 12.3;
		int i6 = (int)d2;
		System.out.println(d2);
		System.out.println(i6);

	}
}















