package Know_OverrideOrOverWrite;

public class Student extends Person{
	String major;

	public Student() {
		super();
	}

	public Student(String major) {
		super();
		this.major = major;
	}
	
	public void study() {
		System.out.println("专业是" + major);
	}
	
	//重写父类的eat方法
	public void eat() {
		System.out.println("学生应该吃有营养的食物");
	}
	
	public void show() {
		System.out.println("我是一个学生");
	}
	
	public String/*String是Object类的子类*/ info() {
		return null;
	}
	
}
