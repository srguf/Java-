package Know_InterfaceJDK8;

public interface CompareB {
	
	public default void method3() {
		System.out.println("CompareB:ShangHai");
	}
	public default void method4() {
		//知识点1：
		CompareA.method1();
		
		System.out.println("CompareB:深圳");
	}
}
