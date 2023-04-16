package Konw_Polymorphism;

import java.sql.Connection;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Dog());//Animal animal = new Dog();
		System.out.println();
		
		test.func(new Cat());
		
	}
	
	
	public void func(Animal animal) {
		animal.eat();
		animal.shout();
	}
	
}


class Animal{
	
	public void eat() {
		System.out.println("动物，进食");
	}
	
	public void shout() {
		System.out.println("动物，叫");
	}
	
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	public void shout() {
		System.out.println("汪！汪！汪");
	}
	
}

class Cat extends Animal{
	
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void shout() {
		System.out.println("喵！喵！喵！");
	}
	
}


//举例二

class Order{
	
	public void method(Object obj) {
		//所有Object包下的Subclass都可以调用
	}
	
}

//举例三
class Driver{
	
	public void doData(Connection conn) {//conn = new MySQLConnection
		//规范的步骤去操作数据
		
		
	}
	
}






