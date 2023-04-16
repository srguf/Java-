package Exer_Polymorphism;

public class _InstanceTest {
	public static void main(String[] args) {
	_InstanceTest test = new _InstanceTest();
	test.method(new Student());
	
	}

	public void method(Person e) {
		String info = e.getInfo();
		System.out.println(info);
		
		if(e instanceof Graduate) {
			System.out.println("a Graduate student");
		}else if(e instanceof Student) {
			System.out.println("a student");
		}else {
			System.out.println("a person");
		}
	}
	
}


class Person {
	protected String name = "person";
	protected int age = 50;
	
	public String getInfo() {
		return "Name" + name + "\nage:" + age;
	}
		
}
class Student extends Person {
	protected String school = "puk";
	
	public String getInfo() {
		return "Name" + name + "\nage:" + age
				+ "\nschool" + school;
	}
	
}

class Graduate extends Student {
	public String major = "IT";
	
	public String getInfo() {
		return "Name" + name + "\nage:" + age
				+ "\nschool" + school + "\nmajor" + major;
	}
	
}