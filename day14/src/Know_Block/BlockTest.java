package Know_Block;

/*
 * 类的成员之四：代码块(初始化块)
 * 
 * 1.代码块的作用：用来初始化类、对象
 * 
 * 2.代码块如果有修饰的话，只能有static
 * 
 * 3.静态代码块 vs 非静态代码块
 * 	静态代码块:
 * 		>内部可以有输出语句
 * 		>随着类的加载而执行 (类只能加载一次)
 * 		>作用：初始化类的信息
 * 		>如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 			(静态代码块的执行优先于非静态代码块的执行)
 * 		>可以调用静态属性，方法。但不能调用非静态属性，方法
 * 
 * 	非静态代码块：
 * 		>内部可以有输出语句
 * 		>随着对象的创建而执行,每创建一个对象执行一次
 * 		>作用：可以在创建对象时对对象的属性等进行初始化
 * 		>如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
 * 		>可以调用非静态属性，方法。也可以调用静态属性，方法
 * 
 * 4.对属性可以赋值的位置：
 * (1)默认初始化
 * (2)显式初始化\(3)在代码块中赋值
 * (4)构造器初始化
 * (5)"对象.属性"或"对象.方法"初始化
 */

public class BlockTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println(Person.decribe);
		System.out.println();
		System.out.println(Person.decribe);
		System.out.println();
		
		System.out.println("***************");
		Person p1 = new Person();
		Person p2 = new Person();
		
	}
}

class Person{
	//属性
	String name;
	int age;
	static String decribe;
	
	//代码块
	static{
		System.out.println("hello, static block-1");
		decribe = "I'm Person";
	}
	static{
		System.out.println("hello, static block-2");
		decribe = "I'm Person";
		info();
	}
	
	{
		System.out.println("hello, block");
	}
	
	//构造器
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//方法
	public void eat() {
		System.out.println("eat");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public static void info() {
		System.out.println("I'm happy");
	}

	
}





