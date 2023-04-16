package knowledge;

/*
 * 关于变量的赋值
 * 
 * 如果变量是 基本数据类型，此时赋值的是变量所保存的数据值
 * 如果变量是 引用数据类型，此时的变量是所保存的数据的地址值(含变量的数据类型)
 * 
 * 
 * 
 * 
 * 方法形参的传递机制：值传递
 * 
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 * 
 * 2.值传递机制：
 * 如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的_数据值
 * 如果参数是引用 数据类型，此时实参赋给形参的是实参存储数据的_地址值
 * 
 */

public class VallueTransferTest {
	public static void main(String[] args) {
		
		System.out.println("*****基本数据类型*****");
		int m = 10;
		int n = m;
		System.out.println("m = " + m + ", n = " + n);
		
		n = 20;
		System.out.println("m = " + m + ", n = " + n);
		
		
		System.out.println("*****引用数据类型*****");
		Order o1 = new Order();
		o1.orderId = 1001;
		
		Order o2 = o1;//赋值后地址值相同
		System.out.println("o1.orderId = " + o1.orderId + ",\no2.orderId = " + o2.orderId);
		
		o2.orderId = 1002;
		System.out.println("o1.orderId = " + o1.orderId + ",\no2.orderId = " + o2.orderId);
		
		
		
		System.out.println("***********************");
		VallueTransferTest test = new VallueTransferTest();
		
		test.swap(m, n);//10,20
		System.out.println("m = " + m + ", n = " + n);//10,20
		
		System.out.println("***********************");
		Data data = new Data();
		
		data.m = 10;
		data.n = 20;
		System.out.println("m = " + data.m + ", n = " + data.n);//10,20
		
		test.swap(data);
		System.out.println("m = " + data.m + ", n = " + data.n);//20,10
	}
	
	public void swap(int m,int n) {
		int temp = m;
		m = n;
		n = temp;
		
	}
	
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
	
}

class Order{
	int orderId =1001;
}

class Data{
	int m;
	int n;
}




