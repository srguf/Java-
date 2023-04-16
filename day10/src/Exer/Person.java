package Exer;

/*
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 
 */

public class Person {
	private int age;
	
	void setAge(int a) {
		if(a < 0 || a > 130) {
//			throw new RuntimeException("传入的数据非法！");
			System.out.println("请输入0~130内的数字");
		}else {
			age = a;
		}
		
	}
	
	int getAge() {
		return age;
	}
	
	//绝对不要这样写!!!!
	int doAge(int a) {
		age = a;
		return age;
	}
	
	
}
