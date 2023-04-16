package Know_Instanceof;

/*
 * 面向对象之三：多态性
 * 
 * 1.理解多态性：可以理解为一个事物的多种形态
 * 2.何为多态性
 * 		对象的多态性：父类的引用指向子类的对象(或子类的对象赋给父类的引用)
 * 3.多态的使用：虚拟方法的调用
 * 		有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，
 * 	但在运行期，我们实际执行的是子类重写父类的方法	
 * 	(总结：编译看左边，执行看右边)
 * 
 * 4.多态性的使用前提:(1)类的继承关系
 * 				  (2)方法的重写
 * 
 * 5.对象的多态性，只适用于方法，不适用与属性(编译和运行都看左边)
 * 
 * ********************************************************
 *  instanceof关键字的使用:
 *  
 * 1. a instanceof A:判断对象a是否是类A的实例。
 * 	 如果是，返回true。如果不是，返回false。
 * 
 * 使用情景：为了避免出现异常，我们在向下转型之前，先进行instanceof的判断，
 * 返回true，则向下转型，返回false，则终止转型
 * 
 *    如果a instanceof A返回true，则a instanceof B也返回true，
 * 其中`类B`是`类A`的父类
 * 
 * 练习：
 * 1.若子类重写了父类方法，就意味着子类里定义的方法彻底覆盖了父类里的方法。
 * 系统将不可能把父类里的方法转移到子类中。
 * 2.对于实例变量则不存在这样的现象，即使子类里定义了与父类完全相同的实例变量，
 * 这个实例变量依然不可能覆盖父类中定义的实例变量
 * 		(时刻想象内存结构！！！)
 * 		(因为堆中会将子父类属性全部压进，而方法在方法区中会被覆盖)
 * 		(在调用父类同名属性时就近调用（就近原则）)
 * 
 */

public class PersonTest {
	public static void main(String[] args) {		
		Person p2 = new Man();

		System.out.println("/*************************************/");
		p2.name = "Tom";
		//不能调用子类特有的方法、属性:编译时，p2是Person类型。
//		p2.earnMoney();
//		p2.isSmoking = true;
		
		//有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，
		//但是由于声明为父类类型，导致编译时只能调用父类中声明的属性和方法。
		//子类特有的属性和方法不能调用。
		
		//如何才能调用子类特有的属性和方法？
		//向下转型，使用强制类型转换符
		Man m1 = (Man)p2;//p2的类型是Person父类
		m1.earnMoney();
		m1.isSmoking = true;
		System.out.println();
		
		//使用强转时，可能会出现ClassCastException异常
//		Woman w1 = (Woman)p2;
//		w1.goShopping();错误！！！！！！！
		
		/*
		 * instanceof关键字的使用
		 * 
		 * a instanceof A:判断对象a是否是类A的实例。
		 * 	如果是，返回true。如果不是，返回false。
		 * 
		 * 使用情景：为了避免出现异常，我们在向下转型之前，先进行instanceof的判断，
		 * 返回true，则向下转型，返回false，则终止转型
		 * 
		 * 如果a instanceof A返回true，则a instanceof B也返回true，
		 * 其中`类B`是`类A`的父类
		 */
		
		if(p2 instanceof Woman) {
			System.out.println("*******Woman******");
			Woman w1 = (Woman)p2;
			w1.goShopping();
		}else {
			System.out.println("*******Woman******");
			System.out.println("强转失败，类型不匹配");
		}
		if(p2 instanceof Man) {
			System.out.println("*******Man******");
			Man m2 = (Man)p2;
			m2.earnMoney();
		}else {
			System.out.println("*******Woman******");
			System.out.println("强转失败，类型不匹配");
		}
		
		if(p2 instanceof Person) {
			System.out.println("*******Person******");
		}
		if(p2 instanceof Object) {
			System.out.println("*******Object******");
		}
		
/*******************************************************************/
		//练习：
		//问题一：编译时通过，运行时不通过
		//举例一：
//		Person p3 = new Woman();
//		Man m3 = (Man)p3;
		//举例二：
//		Person p4 = new Person();
//		Man m4 = (Man)p4;
		//以上行为相当于：Man p4 = new Person();，
		//但是由于强转可以允许下转上，所以编译不报错，运行报错.
		//相当于骗过了编译器
		
		//问题二：编译通过，运行时也通过
		Object obj = new Woman();
		@SuppressWarnings("unused")
		Person p = (Person)obj;
		
		//问题三：编译不通过
//		Man m5 = new Woman();
		
		
	}
}





