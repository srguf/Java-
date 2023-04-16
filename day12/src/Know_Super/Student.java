package Know_Super;

public class Student extends Person {
	String major;
	int id = 1002;//学号
	
	public Student() {
	}
	public Student(String major) {
		this.major = major;
	}
	public Student(String name,int age,String major) {
//		this.name = name;
//		this.age = age;
		super(name,age);
		this.major = major;
	}
	
	@Override
	public void eat() {
		System.out.println("Student,eat");
	}
	public void study() {
		System.out.println("Student,study");
		this.eat();
		super.eat();
	}
	public void show() {
		System.out.println("name = " + this.name + " age = " + super.age);
		System.out.println("major = " + major);
		System.out.println("id(Student) = " + id);
		System.out.println("id(Person) = " + super.id);
		
	}
	
}
