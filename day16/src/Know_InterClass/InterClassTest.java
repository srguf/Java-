package Know_InterClass;
/*
 * 类的内部成员之五：内部类
 * 1.Java中允许将一个类A声明在另一个类B中，则A就是内部类，类B称为外部类
 * 
 * 2.内部类的分类：
 * 		成员内部类(静态、非静态) vs 局部内部类(方法内、代码块内、构造器内)
 * 
 * 3.成员内部类
 * 		一方面，作为外部类的成员：
 * 			>调用外部类的结构
 * 			>可以被static修饰
 * 			>可以被4种不同的权限修饰
 * 		另一方面，作为一个类：
 * 			>类内可以定义属性、方法、构造器等
 * 			>可以被final修饰，表示此类不可被继承
 * 			>可以被abstract修饰
 * 
 * 4.关注如下的三个问题：
 * 	4.1如何实例化成员内部类的对象
 * 	4.2如何在成员内部类中去区分调用外部类的结构
 * 	4.3开发中，局部内部类的使用
 * 
 */
public class InterClassTest {
	public static void main(String[] args) {
		
		//创建Dog实例(静态成员内部类)：
		Person.Dog dog = new Person.Dog();
		dog.show();
		System.out.println();
		
		//创建Bird实例(非静态的成员内部类)：
		Person p = new Person();
		@SuppressWarnings("unused")
		Person.Bird b = p.new Bird();
		//or
		Person.Bird bird = new Person().new Bird();
		bird.sing();
		System.out.println();
		
		bird.display("黄鹂");
		
	}
}

class Person{
	
	String name;
	int age;
	//静态成员内部类
	static class Dog{
		String name;
		int age;
		
		public void show() {
			System.out.println("Dog,Show me!");
		}
	}
	//非静态成员内部类
	final class Bird{
		String name;
		
		public Bird() {
			this.name = "杜鹃";
		}
		
		public void sing() {
			System.out.println("Bird,sing~~");
			Person.this.eat();//调用外部类的属性
//			this.eat;  此处的this表示Bird！！！！！
		}
		
		public void display(String name) {
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
		}
		
	}
	
	//代码块内部类
	{
		this.name = "小明";
		//局部内部类
		@SuppressWarnings("unused")
		class A{
			
		}
	}
	
	public Person() {
		//局部内部类
		@SuppressWarnings("unused")
		class B{
			
		}
	}
	
	public void eat() {
		System.out.println("Person,eat");
	} 
	
	public void method() {
		//局部内部类
		@SuppressWarnings("unused")
		class C{
			
		}
	}
	
}

