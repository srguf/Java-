package knowledge;

/*
 * 可变个数形参的方法
 * 
 * 1.jdk 5.0新增内容
 * 
 * 2.具体使用
 * 		2.1可变个数的形参的格式：数据类型...变量名
 * 		2.2当调用可变个数形参的方法时，传入的参数个数可以是：0，1，2...
 * 		2.3可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重构
 * 		2.4可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载(不能共存)
 * 		2.5可变个数形参在方法形参中，必须声明在末尾
 * 		2.6可变个数形参在方法形参中，最多只能声明一个可变形参
 * 
 */

public class VariableNumberOfArgument {
	public static void main(String[] args) {
		VariableNumberOfArgument test = new VariableNumberOfArgument();
		test.show(12);
		test.show("hello");
		test.show("hello","world");;
		test.show();
		
	}
	
	public void show(int i) {
		System.out.println("int");
	}
	
	public void show(String s) {
		System.out.println("String");
	}
	
	public void show(String ... strs) {
		System.out.println("String ... strs");
		
		for(int i = 0;i < strs.length;i++) {
			System.out.print(strs[i] + " ");
		}
		System.out.println();
	}
//	public void show(String[] strs) {
//		System.out.println("String ... strs");
//	}
	
	public void show(int i,String ... strs) {
	
	}
	
}


