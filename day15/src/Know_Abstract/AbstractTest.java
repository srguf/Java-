package Know_Abstract;

/*
 * abstract关键字的使用
 * 1.abstract：抽象的
 * 2.abstract可以用来修饰的结构：类、方法
 * 
 * 3.abstract修饰类：抽象类
 * 		>此类不能实例化
 * 		>抽象类中一有构造器，便于子类实例化时调用
 * 			(开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作)
 * 
 * 4.abstract修饰方法：抽象方法
 * 		>抽象方法只有方法的声明，没有方法体
 * 		>抽象方法一定在抽象类内，反之抽象类中可以没有抽象方法
 * 		>子类只有重写了父类中所有的抽象方法后，子类才可实例化
 * 		 若子类没有重写父类中所有的抽象方法，则子类也只能是一个抽象类，需要有abstract修饰
 * 
 * 
 * abstract使用上的注意点：
 * 1.abstract不能用来修饰：属性、构造器等结构
 * 
 * 2.abstract不能用来修饰私有方法、静态方法、final的方法、final的类
 * 	(private子类看不到，无法重写)(static不是重写)(final方法禁止重写)(final类无法被继承)
 * 
 * 
 * 自己的一点小理解：
 * 	  抽象类的存在就是为了将一些难以具象化的父类、方法表示出来
 */

public class AbstractTest {
	public static void main(String[] args) {
		
		//一旦Person类抽象了，就不可实例化
//		Person p1 = new Person();Cannot instantiate the type Person
//		p1.eat();
		
	}	
}

abstract class Creature{
	public abstract void breath();
}



abstract class Person extends Creature{
	String name;
	int age;

	public Person() {
		
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void eat();
	
	public void walk() {
		System.out.println("Person,walk");
	}

}



class Student extends Person{

	public Student(String name,int age) {
		super(name,age);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Student,eat nutritional food");
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Student,should breath fresh air");
	}
}

