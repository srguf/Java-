package Know_Super;

public class Person {
	String name;
	int age;
	int id = 1001;//身份证号
	
	public Person() {	
		System.out.println("我无处不在！");
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("Person,eat");
	}
	public void walk() {
		System.out.println("Person,walk");
	}
	
}
