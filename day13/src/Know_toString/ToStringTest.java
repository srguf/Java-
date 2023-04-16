package Know_toString;

import java.util.Date;
import java.util.Objects;


/*
 * Object类中toString()的使用
 * 
 * 1.当我们输出一个对象的引用时，实际上是调用这个对象的toString()
 * 
 * 2.Object类中toString()的定义：
 * 	public String toString() {
 *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *  }
 *  
 *  3.像String、Data、File、包装类等都重写了Object类中的toString()方法。
 *  使得调用对象toString()时，返回"实体内容"信息
 *  
 *  4.自定义类也可以重写toString()方法：当调用此方法时，返回对象的"实体内容"
 *  
 */

public class ToStringTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer("Tom",21);
		
		System.out.println(cust1.toString());
			//Know_toString.Customer@6f2b958e --> Customer[name = Tom,age = 21]
		System.out.println(cust1);
			//Know_toString.Customer@6f2b958e --> Customer[name = Tom,age = 21]
		
		String str = new String("MM");
		System.out.println(str);//MM
		
		Date date = new Date(48541854848L);
		System.out.println(date.toString());
		
	}

}



class Customer{
	String name;
	int age;
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//自动生成的equals()：比较两个对象的实体内容是否相同
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	//手动实现
//	@Override
//	public String toString() {
//		return "Customer [name = " + name + ",age = " + age + "]";
//	}
	
	//自动实现
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}	




	