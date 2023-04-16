package Know_OverrideOrOverWrite;

public class Person {
	String name;
	int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void walk(int distance) {
		System.out.println("走路距离是" + distance + "公里 ");
		eat();//被重写
		show();//因为private没有被重写!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	private void show() {
		System.out.println("我是一个人");
	}
	
	public Object info() {
		return null;
	}
	
}
