package knowledge;

/*
 * 方法的重载(overload) loading...
 * 
 * 1.定义：在同一类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可
 * 
 * 		"两同一不同"：同一个类，相同方法名
 * 				   参数列表不同(参数个数)(参数类型)
 * 
 * 2.举例：
 * 		Arrays类中又重载的的sort() / binarySearch()
 * 
 * 3.判断是否是重载：
 * 		和方法的 权限修饰符
 * 			   返回值类型
 * 			   形参变量名
 * 			   方法体    都没有关系！！！！
 * 
 * 4.在通过对象调方法时，机器如何确定某一个指定的方法
 * 		方法名 ---> 参数列表 
 * 
 */

public class OverLoadTest {
	public static void main(String[] args) {
		OverLoadTest test = new OverLoadTest();
		
		test.getSum(1, 2);
		test.getSum(1.0, 2);
		
	}
	
	//重载
	public void getSum(int i,int j) {
		System.out.println(i + j);
	}
	
//	private void getSum(int i,int j) {
//		System.out.println(i + j);
//	}
	
	public void getSum(double i,double j) {
		System.out.println(i + j);
	}
	
	public void getSum(String i,int j) {
		System.out.println(i + j);
	}
	
	public void getSum(int i,String j) {
		System.out.println(i + j);
	}
	
	
	
}





