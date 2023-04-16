package Know_InterfaceJDK8;

/*
 * JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * 
 * 知识点1：接口中定义的静态方法，只能通过接口来调用
 * 知识点2：通过实现类的对象可以实现接口中的默认方法
 * 知识点3：如果父类方法与接口的默认方法同名同参，优先调用父类的方法 --- 类优先原则
 * 			(全局变量无类优先原则，会报错)
 * 知识点4：如果类实现了多个接口，而这多个接口中定义了同名同参的默认方法，
 *			那么在在没有重写此方法的情况下，报错。 ---> 接口冲突
 * 知识点5：如何在子类(或实现类)中调用父类、接口中被重写的方法
 * 
 */

public interface CompareA {
	
	//静态方法
	public static void method1() {
		System.out.println("ComapareA:BeiJing");
	}
	
	//默认方法
	public default void method2() {
		System.out.println("CompareA:ShangHai");
	}
	default void method3() {//public 被省略 !!!!!
		System.out.println("CompareA:ShangHai");
	}
	public default void method4() {
		System.out.println("CompareA:深圳");
	}
	
}
