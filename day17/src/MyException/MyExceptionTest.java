package MyException;

/*
 * 如何自定义异常类
 * 1.继承现有的异常结构：RuntimeException、Exception
 * 2.提供全局常量：serialVersionUID
 * 3.提供几个重载的构造器
 * 
 */

public class MyExceptionTest extends RuntimeException{
	
	static final long serialVersionUID = -70348971907457669L;
	
	public MyExceptionTest() {
		
	}
	
	public MyExceptionTest(String msg) {
		super(msg);
	}
	
}






