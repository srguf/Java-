package Know_InterfaceJDK8;

public class SubClassTest {
	public static void main(String[] args) {
		
		Subclass s = new Subclass();
		
		//知识点1：接口中定义的静态方法，只能通过接口来调用
//		s.method1();  The method method1() is undefined for the type Subclass
//		Subclass.method1();  The method method1() is undefined for the type Subclass
		CompareA.method1(); 
		System.out.println();
		
		//知识点2：通过实现类的对象可以实现接口中的默认方法
		//默认方法可以被重写
		s.method2();
		System.out.println();
		
		//知识点3：如果父类方法与接口的默认方法同名同参，优先调用父类的方法 --- 类优先原则
		s.method3();
		System.out.println();
		
		//知识点4：如果类实现了多个接口，而这多个接口中定义了同名同参的默认方法，
		//那么在在没有重写此方法的情况下，报错。 ---> 接口冲突
		s.method4();
		
	}
}

class Subclass extends SuperClass implements CompareA,CompareB{
	
	@Override
	public void method2() {
		System.out.println("Subclass:ShangHai");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Subclass:深圳");
	}
	
	//知识点5：如何在子类(或实现类)中调用父类、接口中被重写的方法
	public void myMethod() {
		method3();//重写的方法
		super.method3();//父类中的方法
		CompareA.super.method3();//规定
		CompareB.super.method3();
	}
	
}
