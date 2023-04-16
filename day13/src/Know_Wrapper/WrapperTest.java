package Know_Wrapper;

import org.junit.Test;

/*
 * 包装类的使用
 * 一、java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 * 
 * 二、掌握的：基本数据类型、包装类、String三者之间的互相转换
 * 
 * 
 * (1)基本数据类型--->包装类:调用包装类的构造器
 * (2)包装类--->基本数据类型：调用包装类的 .xxxValue()
 * 		(1，2了解)
 * 
 * (3)JDK 5.0新特性：自动装箱与自动拆箱
 * (4)基本数据类型--->String类型:两种方法
 * 		1.方式一：连接运算
 * 		2.方式二：调用String的valueOf(Xxx xxx)
 * (5)String类型--->基本数据类型、包装类:调用包装类的parseXxx()
 */

public class WrapperTest {
	
	
	//基本数据类型--->包装类:调用包装类的构造器
	@SuppressWarnings("unused")
	@Test
	public void test1() {
		
		int num1 = 10;
//		System.out.println(num1.toString());
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		Float f1 = new Float(12.3f);
		Float f2 = new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("TrUe");
		System.out.println(b2);
		Boolean b3 = new Boolean("true123");
		System.out.println(b3);//false
		
		
		Order order = new Order();
		System.out.println(order.isMale);//默认false
		System.out.println(order.isFemale);//默认null
		System.out.println();
	}
	
	
	
	//包装类--->基本数据类型：调用包装类的 .xxxValue()
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		
		
		Float flo1 = new Float(12.3);
		float f1 = flo1.floatValue();
		System.out.println(f1 + 1);
		System.out.println();
	}
	
	
	
	/*
	 * JDK 5.0新特性：自动装箱与自动拆箱
	 * 
	 */
	@SuppressWarnings("unused")
	@Test
	public void test3() {
		int num1 = 10;
		//基本数据类型--->包装类对象
		method(num1);
		
		//自动装箱：
		int num2 = 10;
//		Integer in1 = new Integer(num2);
		Integer in1 = num2;//自动装箱
		
		boolean b1 = true;
//		Boolean b2 = new Boolean(b1);
		Boolean b2 = b1;//自动装箱
		
		//自动拆箱
//		int num3 = in1.intValue();
		int num3 = in1;//自动拆箱
		System.out.println();
		
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	
	
	//基本数据类型--->String类型:两种方法
	@Test
	public void test4() {
		
		//方式一：连接运算
		int num1 = 10;
		String str1 = num1 + "";
		//方式二：调用String的valueOf(Xxx xxx)
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str1 + "\n" + str2 + "\n" + str3);
		
	}
	
	//String类型--->基本数据类型、包装类:调用包装类的parseXxx()
	@Test
	public void test5() {
		
		String str1 = "123";
		//不是数字可能报错
		int num = Integer.parseInt(str1);
		System.out.println(num + 1);//124
		
		String str2 = "true1";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);//false
		
	}
	


}

class Order{
	
	boolean isMale;
	Boolean isFemale;
}


