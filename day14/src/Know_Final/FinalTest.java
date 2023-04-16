package Know_Final;

/*
 * final:最终的
 * 
 * 1.final可以用来修饰的结构：类、方法、变量
 * 
 * 	(1)final修饰一个`类`：此类不能被其他类所继承
 * 		例如：String类、System类、StringBuffer类
 * 
 * 	(2)final用来修饰`方法`：表明此方法不可以被重写
 * 		比如：Object类中的getClass();
 * 
 * 	(3)final用来修饰`变量`：此时变量就称为是一个常量
 * 		①修饰属性：可以考虑的位置有：显式初始化、代码块中初始化、构造器中初始化
 * 		②final修饰局部变量：表明是一个常量，初始化后只能使用，不能更改
 * 
 * static final 用来修饰属性：全局常量
 */

public class FinalTest {
	final int WIDTH = 0;
	final int LEFT;
	final int RIGHT;
	
	{
		LEFT = 1;
	}
	
	public FinalTest() {
		RIGHT = 2;
	}
	
	//final修饰局部变量
	public void show() {
		@SuppressWarnings("unused")
		final int NUM = 10;//常量
//		NUM += 20;
	}
	public void show(final int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		FinalTest test = new FinalTest();
		
		test.show(10);
	}
}

 final class finalA{
	
}

//class finalb extends finalA{
//	
//}





