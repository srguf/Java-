package knowledge;

/*
 * 类中方法的声明和使用
 * 
 * 方法:描述类应该具有的功能
 * 比如:Math类:aqrt() \ random() \ ...
 * 	   Scanner类:nextXxx()...
 * 	   Arrays类:sort() \ binarySearch() \ ttoString() \ equals() \ ...
 * 
 * 1.举例
 * 无返回值
 * 		public void eat() {}
 * 		无形参
 * 		public void sleep(int hour) {}
 * 		有形参
 * 有返回值
 * 		public String getName() {}
 * 		无形参
 * 		public String getNation(String nation) {}
 * 		有形参
 * 
 * 
 * 2.方法的声明：
 * 		权限修饰符 返回值类型 方法名（形参列表）{
 * 			方法体;
 * 		}
 * 		注意：static、final、abstract 来修饰的方法，后面再讲
 * 
 * 
 * 3.说明
 * 		3.1关于权限修饰符:
 * 			Java规定的4种权限修饰符：private、public、缺省、protected -->封装性细谈
 * 			
 * 		3.2返回值类型:  有返回值 vs 无返回值 
 * 			3.2.1如果方法有返回值，必须在方法声明中指定返回值的类型,
 * 				 同时在方法中需要使用return关键字来返回指定类型的变量或常量。
 * 				如果 没有返回值，则方法声明时，使用void来表示。
 * 				一般不使用。但是如果使用的话，只能"return;"，表示结束方法。
 * 			3.2.2我们定义方法该不该有返回值？
 * 				 题目要求
 * 				 思考
 * 		
 * 		3.3方法名：属于标识符，遵循标识符规范："见名知意"
 * 
 * 		3.4形参列表方法可以声明0个，1个，或多个形参。
 * 			3.4.1格式：(数据类型1 形参1,数据类型2 形参2, ...)
 * 			3.4.2我们定义方法时该不该定义形参？
 * 				 题目要求
 * 				 思考
 * 		
 * 		3.5方法体：方法功能的体现
 * 
 * 
 * 4.return关键字的使用：
 * 		1.使用范围
 * 		2.作用:1)结束方法
 * 			  2)针对于有返回值类型的方法，使用return返回方法所要的数据
 *  	3.return后不可以声明执行语句(同break)
 *  
 *  5方法的使用中，可以直接调动当前类的属性或方法
 *  		特殊的：方法A中又调用了方法A：递归方法
 *  	方法中不可以定义方法
 */

public class MethodTest {
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.eat();
		System.out.println("/*********************/");
		cust1.sleep(8);
		System.out.println("/*********************/");
		//cust1.getNation(China);
	}
}

//客户类
class Customer{
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat() {
		System.out.println("客户吃饭");
	}
	
	public void sleep(int hour) {
		System.out.println("休息了" + hour + "几个小时");
		
		eat();
	}
	
	public String getName() {
		return name;
	}
	

	public String getNation(String nation) {
		String info = "我的国籍是" + nation;
		return info;
	}
	
}



