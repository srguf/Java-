package Exer_Wrapper;

import org.junit.Test;

/*
 * 2016阿里面试题
 * 
 */

public class WrapperTest {
	
	@Test
	public void test() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false(地址值)
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		//如果使用自动装箱的方式，则会在堆内部开辟一个Integer[]{-128~127}
		//原因:Integer内部定义了IntegerCache结构 
		//	  IntegerCache中定义了cache[]{-128~127}
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false
		//128 > 127,所以会重新开辟空间(new Integer)
	}
	
}
