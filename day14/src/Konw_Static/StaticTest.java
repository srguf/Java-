package Konw_Static;

/*
 * static关键字的使用
 * 		新增内存知识：方法区：类的加载信息、静态域、常量池；
 * 		static类变量存储在方法区的静态域当中
 * 
 * 1.static：静态的
 * 2.static可以用来修饰：属性、方法、代码块、内部类
 * 
 * 3.使用static修饰属性：静态变量(类变量)
 * 		3.1属性：按是否使用static修饰，又分为：静态属性 vs 非静态属性(实例变量)
 * 			实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。
 * 					当修改一个对象中的静态属性时，不会导致其他对象中同属性值的修改
 * 			静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。
 * 					当通过某一对象修改静态变量时，会导致所有同一变量的改变
 * 			
 * 		3.2static修饰属性的其他说明：
 * 			3.2.1静态变量(类变量)随着类的加载而加载,可以通过"类.静态变量"的方式进行调用
 * 			3.2.2静态变量(类变量)的加载早于对象的创建
 * 			3.2.3由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
 * 
 * 		3.3静态属性举例：System.out; Math.PI;
 * 
 * 4.使用static修饰方法：
 * 		4.1随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
 * 		4.2静态方法中只能调用静态的方法或属性
 * 		   非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 * 		
 * 5.ststic注意点
 * 		5.1在静态方法中，不能够使用this、super关键字
 * 		5.2关于静态属性和静态方法的使用，大家都从生命周期的角度去考虑
 * 
 * 6.开发中，如何确定一个属性是否要声明为static？
 * 		>属性共享(不会有因为对象不同而改变)
 * 		>类中的常量也常常声明为static
 * 
 *   开发中，如何确定一个方法是否要声明为static？
 *   	>操作静态属性的方法，通常设置为static的
 *   	>工具类中的方法，习惯上声明为static的。比如：Math、Arrays、Collections
 */

public class StaticTest {
	public static void main(String[] args) {
		
		Chinese.nation = "中国";
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		Chinese.nation = "china";
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		
		System.out.println(Chinese.nation);
		System.out.println();
		
		c1.eat();
		System.out.println();
		
		Chinese.show();
		
	}
}

//中国人
class Chinese{
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("中国人吃中餐");
		//调用非静态结构
		this.info();
		//调用静态结构
		walk();
		
	}
	
	public static void show() {
		System.out.println("我是一个中国人");
		//不能调用非静态的结构
//		eat();
//		name = "Tom";
		//可以调用静态的结构
		System.out.println(Chinese.nation);
		walk();
//		Chinese.walk();
	}
	
	public static void walk() {
		
	}
	
	public void info() {
		System.out.println("name:" + name + ", age:" + age);
	}
	
}




