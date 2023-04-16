package Know_Singleton;

/*
 * 单类设计模式：
 * 1.单类设计模式就是采用一定的方法，在整个软件系统中，让某个类只能存在一个对象实例。
 * 		(只要让对象变为静态的就可以只拥有一个对象了)
 *   
 * 2.如何实现？
 * 	饿汉式 vs 懒汉式
 * 		饿汉式：								懒汉式：
 * 			2.1要求私有化类的构造器					2.1要求私有化类的构造器	
 * 			2.2内部创建类的对象						2.2内部创建类的对象，没有初始化
 * 			2.3提供公共的静态的方法，返回类的对象		2.3提供公共的静态的方法，返回类的对象
 * 			2.4要求对象声明为静态的					2.4要求对象声明为静态的
 * 
 * 3.区分饿汉式和懒汉式
 * 	饿汉式：
 * 		坏处：对象加载时间过长
 * 		好处：饿汉式线程安全
 * 	懒汉式：
 * 		好处：延迟对象的创建
 * 		坏处：懒汉式线不程安全 ---> 到多线程时再修改
 */
 
public class SingletonTest {
	public static void main(String[] args) {
		Bank b1 = Bank.getInstance();
		Bank b2 = Bank.getInstance();
		System.out.println(b1 == b2);
		System.out.println();
		
		Bank1 b11 = Bank1.getInstance();
		Bank1 b12 = Bank1.getInstance();
		System.out.println(b11 == b12);
		
		
	}
}

//饿汉式 单例设计模式
class Bank{
	
	//2.内部创建类的对象
	//4.要求对象声明为静态的
	private static Bank instance = new Bank();
	
	
	//1.要求私有化类的构造器
	private Bank() {
		
	}

	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank getInstance() {
		return instance;
	}
	
}

//懒汉式 单例设计模式
class Bank1{
	
	//2.内部创建类的对象，没有初始化
	//4.要求对象声明为静态的
	private static Bank1 instance = null;
	
	//1.要求私有化类的构造器
	private Bank1() {
		
	}
	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank1 getInstance() {
		if(instance == null) {
			instance = new Bank1();
		}
		return instance;
	}
	
}







