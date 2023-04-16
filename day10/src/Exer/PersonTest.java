package Exer;

/*
 * 创建程序，在其中定义两个类：Person和PersonTest类。
 * 
 * 定义如下：用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 
 * 在PersonTest类中实例化Person类的对象b，
 * 调用setAge()和getAge()方法，体会Java的封装性
 * 
 */

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person person = new Person();
		
//		person.age = 1;  非法
		//The field Person.age is not visible
		
		System.out.println("请输入person对象的Age");
		person.setAge(scan.nextInt());
		System.out.println("Age = " + person.getAge());
		
		scan.close();
	}
}
