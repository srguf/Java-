package Know_SubInstance;

/*
 * 子类对象实例化的全过程
 * 
 * 1.从结果上看:(继承性)
 * 		子类继承父类后就获取了父类的属性或方法
 * 		创建子类的对象，在堆空间中，就会加载所有父类中声明的属性
 * 
 * 2.从过程上看:
 * 		当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器....
 * 	直到调用了java.lang.Object类中的空参构造器为止。正因为加载过所有父类的结构，
 * 	所以才可以看到内存中有父类的结构，子类对象才可以考虑调用
 * 
 * 明确:虽然创建子类对象时，调用了父类的构造器，但是自始至终就创建过一个对象，即为new的子类对象
 * 
 */

public class InstanceTest {
	
}
