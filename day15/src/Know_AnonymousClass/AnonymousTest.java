package Know_AnonymousClass;

/*
 * 抽象类的匿名子类的应用
 * 
 * 小结：需要依托父类进行匿名子类对象的创建
 * 		只有new子类才有意义，不然方法也无法和新类进行匹配
 */

public class AnonymousTest {
	public static void main(String[] args) {
		
		method(new Student());//匿名对象
		
		Worker w1 = new Worker();
		method1(w1);//非匿名的类非匿名的对象
		System.out.println();
		
		method1(new Worker());//非匿名类匿名对象
		System.out.println();
		
		//创建了一个匿名子类的对象：p
		Person p = new Person() {
			@Override
			public void eat() {
				System.out.println("吃东西");
			}
			@Override
			public void walk() {
				System.out.println("好好呼吸");
			}
		};
		method1(p);
		System.out.println();
		
		//创建一个匿名子类的匿名对象
		method1(new Person() {
			@Override
			public void eat() {
				System.out.println("吃好吃的东西");
			}
			@Override
			public void walk() {
				System.out.println("好好呼吸新鲜空气");
			}
		});
		
		//以下为自己的实验 ----- 失败！！！！！！
		method(new Student() {
			@SuppressWarnings("unused")
			public void test() {
				
			}
		});
	}
	
	public static void method1(Person p) {
		p.eat();
		p.walk();
	}
	
	public static void method(Student s) {
		
	}

}

abstract class Person{
	public abstract void eat();
	public abstract void walk();
}

class Student{
	
}

class Worker extends Person{

	@Override
	public void eat() {
		System.out.println("Worker,eat");
	}

	@Override
	public void walk() {
		System.out.println("Worker,walk");
	}
	
}




