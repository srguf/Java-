package Know_Super;

/*
 * super关键字的使用
 * 1.super理解为:父类的
 * 2.super可以用来调用: 3.2属性、3.1_3.3方法、3.1_3.4构造器
 * 
 * 
 * 3.super的使用:调用属性和方法
 * 		3.1 我们可以在子类的方法或构造器中，通过使用"super.方法"的方式，
 * 	显式的调用父类中声明的属性或方法。(通常情况下习惯省略)
 * 		3.2 特殊情况:当子类和父类中定义了同名的属性时，我们想要在子类中调用父类中声明的属性，
 * 	则必须显式的使用"super.属性"的方式，表明调用的时父类中声明的属性
 * 		3.3 当子类重写了父类中的方法以后，我们想在子类的方法中调用父类被重写的方法时，
 * 	则必须显式的使用"super.属性"的方式，表明调用的时父类中被重写的方法
 * 
 * 
 * 4.super调用构造器 	
 * 		4.1 我们可以在子类构造器中显式的使用super(形参列表)的方式，调用类中声明的构造器
 * 		4.2 "super(形参列表)"的使用，必须声明在子类构造器的首行
 * 		4.3 我们在类的构造器中，针对于"this(形参列表)"或"super(形参列表)"只能二选一，
 * 	不能同时出现
 * 		4.4 在构造器的首行，没有显式的声明"this(形参列表)"或"super(形参列表)"，
 * 	则调用的是父类中默认的空参构造器(必定！！！)
 * 
 * 
 */

public class SuperTest {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.show();
		System.out.println();
		stu.study();
		System.out.println();
		
		Student s1 = new Student("Tom", 12, "IT");
		s1.show();
		System.out.println();
		
		@SuppressWarnings("unused")
		Student s2 = new Student();
		
	}
}




