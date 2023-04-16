package knowledge;
/*
 * 一、数组的概述
 * 1.数组的理解：
 * （Array）是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名
 * 并通过编号的方式对这些数据进行统一管理。
 * 
 * 2.数组的相关概念：
 * 	>数组名
 * 	>元素
 * 	>角标、下标、索引
 * 	>数组的长度：元素的个数
 * 
 * 3.数组的特点：
 *   1)数组是有序排列的
 *   2)数组属于引用数据类型变量
 *     数组的元素，既可以是基本数据类型，也可以是引用数据类型
 *   3)创建数组对象会在内存中开辟一整块连续的存储空间
 *   4)数组的长度一旦确定，就不能修改。
 * 
 * 4.数组的分类：
 * 	 1)按照维数：一维数组、二维数组、。。。
 *   2)按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组。
 * 
 * 5.一维数组的使用
 * 	 1)一维数组的声明和初始化
 * 	 2)如何调用数组的指定位置的元素
 *   3)如何获取数组的长度
 *   4)如何遍历数组
 *   5)数组元素的默认初始化值
 *     >数组元素是整形：0
 *     >数组元素是浮点型：0.0
 *     >数组元素是char型: 码值0或'\u0000'，而非'0'
 *     >数组元素是boolean型: false
 *      >数组元素是引用数据类型: null(意为空值)
 *   6)数组的内存解析
 */
public class ArrayTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//1)一维数组的声明和初始化
		int num; //声明
		num = 10; //初始化
		int id = 1001; //声明 + 初始化
		
		int[] ids; //声明
		//1.1静态初始化:数组的初始化和数组元素的赋值操作同时进行
		ids = new int[] {1001,1002,1003,1004};
		//类型推断
		int[] ids1 = {1001,1002,1003,1004};
		
		//1.2动态初始化：数组的初始化和数组元素的赋值操作分开进行
		String[] names = new String[5];
		
		//总结：数组一旦初始化完成，其长度就确定了。(系统需要知道为数组开辟多大的内存空间)
		
		
		//2)如何调用数组的指定位置的元素：通过角标的方式
		names[0] = "王铭";
		names[1] = "王贺";
		names[2] = "张学良";
		names[3] = "孙大圣";
		names[4] = "王同志";
		
		
		//3)如何获取数组的长度
		//属性：length (.提示)
		System.out.println(names.length);//5
		System.out.println(ids.length);//4
		
		
		//4)如何遍历数组 （Ctrl + Alt + 下 快捷复制）
//		  System.out.println(name[0]); 
//		  System.out.println(name[1]);
//		  System.out.println(name[2]); 
//		  System.out.println(name[3]);
//		  System.out.println(name[4]);

		for(int i = 0; i < names.length ; i++) {
			System.out.println(names[i]);
		}
		System.out.println("************");
		
		//5)数组元素的默认初始化值
		int[] arr = new int[4];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("************");
		
		short[] arr1 = new short[4];
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("************");
		
		float[] arr2 = new float[4];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("************");
		
		char[] arr3 = new char[4];
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		if(arr3[0] == 0) {
			System.out.println("你好");
		}
		//证明码值为0
		System.out.println("************");
		
		boolean[] arr4 = new boolean[4];
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		} 
		System.out.println("************");
		
		String[] arr5 = new String[4];
		for(int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		//证明null是空值
		if(arr5[0] == null) {
			System.out.println("不错");
		}
		System.out.println("************");
		
		
		//6)数组的内存解析
		/* 栈：(stack):局部变量
		 * 
		 *堆：(heap):new出来的结构：对象，数组
		 *
		 *方法区：
		 *常量池
		 *静态域
		 *
		 */
		
	}
}






