package Exer_Block;

/*
 * 通过此代码可以看到：
 * 		类与对象、代码块和构造器加载的顺序和关系
 * 
 * 
 * 总结：由父及子，静态先行
 */

class Root{
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	public Root() {
		super();
		System.out.println("Root的无参构造器");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	public Mid() {
		super();
		System.out.println("Mid的无参构造器");
	}
	public Mid(String msg) {
		this();
		System.out.println("Mid的参数构造器。参数为" + msg);
	}
}
class Leaf extends Mid{
	static {
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}
	public Leaf() {
		super();
		System.out.println("Leaf的无参构造器");
	}
}


public class LeafTest {
	public static void main(String[] args) {
		System.out.println("7777777777777");
		System.out.println("*****************");
		new Leaf();	
		System.out.println();
		new Leaf();
	}
}
