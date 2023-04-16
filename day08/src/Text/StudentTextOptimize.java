package Text;

/*
 * 定义Student类，包含三个属性：学号number(int)，年级state(int)，
 * 成绩score(int)。创建20个学生对象，学号为1到20，
 * 年纪(1~6)成绩(0~100)都由随机数确定
 * 
 * 问题一：打印出3年纪(state值为3)的学生信息
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有信息。
 * 
 * 提示：
 * 1)生成随机数：Math.random();返回值类型double
 * 2)四舍五入整数：Math.round(double d),返回值类型long.
 * 
 * 
 * 此代码是对StudentText的改进：将操作数组的功能封装到数组中
 * 
 */

public class StudentTextOptimize {

	public static void main(String[] args) {
		StudentTextOptimize test = new StudentTextOptimize();
		Student1[] stu = new Student1[20]; //String[] a = new String[10];
		
		//在数组内创建类类型的空间并赋值
		test.vlaue(stu);
		
		//遍历学生数组
		test.print(stu);
		System.out.println("/*****************/");
		
		//查找输出3年级的学生信息
		test.searchState(stu,3);
		System.out.println("/*****************/");
		
		//排序
		test.sort(stu);
		
		//输出
		test.print(stu);
		
	}

	/**
	 * 给数组赋值
	 * @param stu 被赋值的数组
	 */
	public void vlaue(Student1[] stu) {
		for(int i = 0;i < stu.length;i++) {
			//给Student型数组元素赋值
			stu[i] = new Student1();
			
			//给数组元素中的Student类的对象的属性赋值
			stu[i].number = i + 1;//学号
			//年级[1,6]
			double n = (Math.random() * 5) + 1;
			int m = (int)Math.round(n);//四舍五入
			stu[i].state = m;
			//成绩[40,100]
			double v = (Math.random() * 60) + 40;
			int b = (int)Math.round(v);
			stu[i].score = b;
		}
	}
	
	
	//打印Student1[]的操作
	public void print(Student1[] s) {
		for(int i = 0;i < 20;i++) {
			System.out.println(s[i].info());
		}
	}
	
	
	/**
	 * 查找Student数组中指定年级的学生信息
	 * @param st 要找的数组
	 * @param state 要找的年级
	 */
	public void searchState(Student1[] st,int state) {
		for(int i = 0;i < st.length;i++) {
			if(st[i].state == state) {
				System.out.println(st[i].info());
			}
		}
	}
	
	
	/**
	 * 排序
	 * 
	 * @param stuu 被排序的数组
	 */
	public void sort(Student1[] stuu) {
		for(int i = 0;i < stuu.length - 1;i++) {
			for(int j = 0;j < stuu.length - 1 - i;j++) {
				if(stuu[j].score > stuu[j + 1].score) {
					//Student temp = new Student();
					//(不用在堆中重建，直接可以定义在栈中)
					Student1 temp = stuu[j];
					stuu[j] = stuu[j + 1];
					stuu[j + 1] = temp;
				}
			}
		}
		
	}


}
		
		
class Student1{
	int number;
	int state;
	int score;
	
	//显示学生的信息
	public String info() {
		return "学生的编号是 " + number 
				+ "\n学生的年级是 " + state 
				+ "\n学生的成绩是 " + score + "\n";
	}
	
}




