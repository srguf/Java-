package Know_Error.Exception;

/*
 * 一、异常体系结构：
 * 
 * java.lang.Throwable
 * 		|-----java.lang.Error:一般不编写针对性的代码处理
 * 		|-----java.lang/Exception:可以进行异常的处理
 * 			|-----编译时异常(checked)
 * 				|-----IOException
 * 					|-----FileNotFoundException
 * 				|-----ClassNotFoundException
 * 			|-----运行时异常(unchecked)
 * 				|-----NullPointerException
 * 				|-----ArrayIndexOutOfBoundsExcepton
 * 				|-----ClassCastException   类的投射(赋值)异常
 * 				|-----NumberFormatException   数字类型不匹配异常
 * 				|-----InputMismatchException   输入类型不匹配异常
 * 				|-----ArithmeticException    算数异常
 * 
 * 
 * 面试题：常见的异常都有哪些？请举例说明
 */

public class ExceptionTest {

}
