package Know_Interface;

/*
 * 接口的使用：
 * 1.接口用interface定义
 * 2.Java中，接口和类是并列的两个结构
 * 
 * 3.如何定义接口：定义接口中的成员
 * 		3.1 JDK7及以前：只能够定义全局常量和抽象方法
 * 			>全局常量：public、static、final的.但是书写时可以省略
 * 			>抽象方法：public、abstract的
 * 		3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * 			 *
			 * 知识点1：接口中定义的静态方法，只能通过接口来调用
			 * 知识点2：通过实现类的对象可以实现接口中的默认方法
			 * 知识点3：如果父类方法与接口的默认方法同名同参，优先调用父类的方法 --- 类优先原则
			 * 			(全局变量无类优先原则，会报错)
			 * 知识点4：如果类实现了多个接口，而这多个接口中定义了同名同参的默认方法，
			 *			那么在在没有重写此方法的情况下，报错。 ---> 接口冲突
			 * 知识点5：如何在子类(或实现类)中调用父类、接口中被重写的方法
			 *
 * 
 * 4.接口中不能定义构造器！意味着接口不可以实例化
 * 
 * 5.Java开发中，接口通过让类去实现(implements)的方式来使用。
 * 		如果实现类覆盖了接口中所有的抽象方法，则此实现类就可以实例化
 * 		如果实现类没有覆盖接口中所有的主要方法，则此实现类仍为一个抽象类
 * 
 * 6.Java可以实现多个接口 ---> 弥补了Java单继承性的局限性
 * 		格式：class AA extends BB implements CC,DD,EE{}
 * 
 * 7.接口与接口之间可以继承，而且可以多继承
 * **************************************
 * 8.接口的使用，体现多态性
 * 
 * 9.接口，实际上是一种规范，定义的是一种规则。
 * 		继承是一个“是不是”的关系，而接口则实现的是“能不能”的关系。
 * 	接口的本质是契约，标准，规范。
 * 
 */

public class InterfaceTest {
	
}

interface Attackable{
	public abstract void attack();
}

interface Flyable{
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	int MIN_SPEED = 1;//省略了public static final 
	
	//抽象方法
	public abstract void fly();
	void stop();//省略了public abstract
	
}

class Piane implements Flyable{
	
	@Override
	public void fly() {
		System.out.println("通过引擎起飞");
	}
	@Override
	public void stop() {
		System.out.println("驾驶员减速停止");
	}
	
}

abstract class Kite implements Flyable{
	
	@Override
	public void fly() {
		
	}
}

class Bullet extends Object implements Flyable,Attackable,CC{
	
	@Override
	public void attack() {
	}
	@Override
	public void fly() {
	}
	@Override
	public void stop() {
	}
	@Override
	public void method1() {
	}
	@Override
	public void method2() {
	}
	
}

/******************************************************************/
//接口的多继承
interface AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA,BB{
	
}



