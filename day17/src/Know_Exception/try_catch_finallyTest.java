package Know_Exception;

import org.junit.Test;

/*
 * 一、异常的处理：抓抛模型
 * 过程一：
 * 		"抛"：程序在正常执行的过程中，一旦出现异常，就会在代码处生成一个对应异常类的对象，并将此对象抛出
 * 	一旦抛出对象后，其后的代码就不在执行
 * 过程二：
 * 		"抓"：可以理解为异常的处理的方式：①try-catch-finally ②throws
 * 
 *     关于异常对象的产生：①：系统自动生成的异常对象
 *     				  ②：手动生成的一个异常对象，并抛出throw
 * 
 * 二、try-catch-finally的使用
 * try{
 * 		//可能出现异常的代码
 * }catch(异常类型1 变量名1){
 * 		//处理异常的方式1
 * }catch(异常类型2 变量名2){
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3){
 * 		//处理异常的方式3
 * }
 * *******
 * finally{
 * 		//一定会执行的代码
 * }
 * 
 * 说明：
 * 	1.finally是可选的，
 * 	2.使用try将可能出现异常的代码块包起来。在执行过程中，一旦出现异常，
 * 		就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配。
 * 	3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。
 * 		一旦处理完成，就跳出当前的try-catch结构。(在没有写finally的情况下)。继续执行后面的代码
 * 	4.catch异常类型如果没有子父类关系，则谁在声明上，谁声明在下无所谓
 * 	  catch异常类型如果满足子父类关系，则要求子类一定要在父类上面，否则报错
 * 	5.常用 的异常处理方式：①String  getMessage();     ②printStackTrace()
 *  6.在try{}结构中定义的变量，出了try{}结构中后就不能被调用了
 *  7.try-catch-finally结构可以嵌套
 *  
 *  
 * 体会1：在使用try-catch-finally处理编译异常，使得程序在编译时不在报错，但是运行时仍可能报错。
 * 		相当于我们使用 try-catch-finally 将一个编译时可能出现的异常延迟到运行时出现
 * 体会2：开发中由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally
 * 		针对于编译的异常，我们一定要考虑异常的处理
 * ****************************************************************************
 *  finally的使用：
 *  
 *  1.finally时可选的
 *  2.finally中声明的是一定会被执行的代码。
 *  	即使catch中也出现了异常，try或catch中有return语句
 *  3.像数据库的连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，
 *  	我们需要自己手动将资源释放。此时的资源释放，需要声明在finally中
 * 
 */

public class try_catch_finallyTest {
	
	@Test
	public void test1() {
		
		String str = "123";
		str = "abc";
//		int num = Integer.parseInt(str);--->java.lang.NumberFormatException
		try {
			@SuppressWarnings("unused")
			int num = Integer.parseInt(str); 
			
			System.out.println("hello-----1");
		}catch(NumberFormatException e) {
			System.out.println("出现数值转换异常");
			//String getMessage:
			System.out.println(e.getMessage());
			
			//printStackTrace():
			e.printStackTrace();
			
		}catch(NullPointerException e) {
			System.out.println("出现空指针异常");
		}catch(Exception e) {
			System.out.println("出现异常了，不要着急~~");
		}
			
		System.out.println("hello-----2");
	}
	
	
	@Test
	public void Test2() {
		
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally!!!");
		}
		
	}
	
	
	
	
}





