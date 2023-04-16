package Text;

/* 要求：
 * 创建一个person类，，设置属性方法，创建一个对象并输出
 * 创建第二个对象体会不同对象间的关系
 * 
 * 
 * 属性(成员变量)定义在堆空间中。
 *   (局部变量)定义在栈中。
 * 		(main方法也是方法)
 * 
 */

public class PersonClass {
	public static void main(String[] args) {
		Person per = new Person();
		
		per.name = "Tom";
		per.age = 18;
		per.sex = 1;
		
		per.study();
		
		per.showAge();
		
		int ageover = per.addAge(2);
		System.out.println(ageover);
		
		System.out.println(per.age);
		System.out.println("/*****************/");
		
		/***************************/
		Person per1 = new Person();
		per1.showAge();//0
		per1.addAge(10);
		per1.showAge();//10
		
		per.showAge();//20
		
	}
}

class Person{
	String name;
	int age;
	/**
	 * sex为1表男性
	 * sex为0表女性
	 */
	int sex;
	
	
	public void study() {
		System.out.println("studying");
	}
	
	public void showAge() {
		System.out.println("age=" + age);
	}
	
	public int addAge(int i) {
		age += i;
		return age;
	}
	
	
}