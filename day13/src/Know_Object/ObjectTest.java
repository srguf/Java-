package Know_Object;

import java.util.Date;
import java.util.Objects;

/*
 * java.lang.Object类
 * 1.Object类是所有java类的根父类
 * 2.如果在声明中未使用extends关键字说明其父类，则默认为java.lang.Object类
 * 3.Object类中的功能(属性，方法)具有通用性
 * 	属性:无
 * 	方法:equals() \ toString \ getClass \ hashCode() \ clone() \ finalize()
 * 		wait() 、notify() 、 notifyAll()
 * 
 * 
 * 面试题: == 和 equals()区别
 * 
 * 一、回顾 == 的使用
 * == 运算符：
 * 1.可以使用在基本数据类型变量和引用数据变量中
 * 2.如果比较的是基本数据类型变量:比较两个变量保存的数据是否相等(不一定类型要相同)
 * 	 如果比较的是引用数据变量，比较两个对象的地址值是否相同，即两个引用是否指向同一个实体中
 * 补充：使用 == 符号时，符号两边的变量类型必须一致，否则报错
 * 
 * 二、equals()的使用
 * 1.是一个方法而非运算符
 * 2.只能适用于引用数据类型
 * 3.Object类中equals的定义:
 * 		public boolean equals(Object obj) {
 *      return (this == obj);
 *  	}
 *  说明：此Object类中定义的equals()和 == 的作用是相同的，
 * 比较两个对象的地址值是否相同，即两个引用是否指向同一个对象实体
 *  
 *  4.像String、Data、File、包装类等都重写了Object类中的equals()方法。
 * 	  重写后比较的不是两个引用的地址是否相同，而是比较的两个对象的"实体内容"是否相同。 
 * 	重写的原则：比较两个对象的实体内容是否相同
 *  
 */

public class ObjectTest {
	public static void main(String[] args) {
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);//true
		System.out.println();
		
		Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		cust1.name = "Tom";
		cust2.name = "Tom";
		System.out.println(cust1 == cust2);//false
		
		String str1 = new String("gjz");
		String str2 = "gjz";
		System.out.println(str1 == str2);//false
		System.out.println();
		
		System.out.println(cust1.equals(cust2));//false --->true(重写后)
		System.out.println(str1.equals(str2));//true
			//(开发者在String中重写了equals方法)
		
		Date data1  = new Date(32L);
		Date data2  = new Date(32L);
		System.out.println(data1.equals(data2));//true
		
		
	}
}

	
class Customer{
	String name;
	int age;
	
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
	
	
	//手动实现equals()的重写：比较两个对象的实体内容是否相同
//	@Override
//	public boolean equals(Object obj) {
//		
//		System.out.println("Customer equal()...");
//        if (this == obj) {
//        	return true;
//        }
//        
//        if(obj instanceof Customer) {
//        	Customer cust = (Customer)obj;
	
//        	//比较两对象属性是否相同
////        	if(this.age == cust.age && this.name.equals(cust.name)) {
////        		return true;
////        	}else {
////        		return false;
////        	}
//        	//或
//        	return this.age == cust.age && this.name.equals(cust.name);
//        }
//        
//        return false;
//    }	
	
}






