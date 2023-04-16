package Know_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 异常处理的方式二：throws + 异常类型
 * 
 * 1."throws + 异常类型"写在方法声明出，指明此方法执行时，可能会抛出异常类型。
 * 		一旦方法执行时，出现异常，仍会在异常代码处生成一个异常类的对象。
 * 		当此对象满足throws后异常类型时，就会被抛出。(异常后代码不会被执行)
 * 
 * 2.体会：try-catch-finally:真正的将异常处理掉了
 * 			throws的方式只是将异常抛给了方法的调用者，并没有真正的将异常处理掉
 * 
 * 3.开发中如何选择使用try-catch-finally或者throws？
 * 		3.1如果父类中被重写的方法没有throws方式处理异常，则子类中重写的方法也不能使用throws
 * 			意味着子类重写的方法中有异常，必须使用tru-catch-fianlly处理异常
 * 		3.2执行的过程中，先后又调用了几个方法，这几个方法是递进关系执行的，
 * 			我们建议这几个方法使用throws的方方式进行处理，(因为递进关系出错了就没必要执行了，没必要处理)
 * 
 */

public class ThrowsTest {

	public static void main(String[] args) {
		try {
			method2();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		method3();
	}
	
	
	public static void method3() {
		try {
			method2();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void method2() throws FileNotFoundException,IOException{
		method1();
	}
	
	public static void method1() throws FileNotFoundException,IOException{
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		
		fis.close();
	}
	
}