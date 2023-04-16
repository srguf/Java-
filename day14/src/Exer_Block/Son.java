package Exer_Block;

/*
 * mian()也是方法，在执行前加载类
 * 
 */

class Person{
	static {
		System.out.println("Person的静态初始化块");
	}
	{
		System.out.println("Person的普通初始化块");
	}
	public Person() {
		super();
		System.out.println("Person的无参构造器");
	}
}

class Father extends Person{
	static {
		System.out.println("Father的静态初始化块");
	}
	{
		System.out.println("Father的普通初始化块");
	}
	public Father() {
		super();
		System.out.println("Father的无参构造器");
	}
	public Father(String msg) {
		this();
		System.out.println("Father的参数构造器。参数为" + msg);
	}
}
public class Son extends Father{
	static {
		System.out.println("Son的静态初始化块");
	}
	{
		System.out.println("Son的普通初始化块");
	}
	public Son() {
		super();
		System.out.println("Son的无参构造器");
	}
	
	public static void main(String[] args) {
		System.out.println("7777777777777");
		System.out.println("*****************");
		new Son();	
		System.out.println();
		new Son();
	}

}



	
