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
 */

public class StudentText {
	public static void main(String[] args) {
		Student[] stu = new Student[20]; //String[] a = new String[10];
		
		for(int i = 0;i < stu.length;i++) {
			//给Student型数组元素赋值
			stu[i] = new Student();
			
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
		
		for(int i = 0;i < stu.length;i++) {
			if(stu[i].state == 3) {
				System.out.println("学生的编号是 " + stu[i].number);
				System.out.println("学生的成绩是 " + stu[i].score);
				System.out.println();
			}
		}
		System.out.println("/*****************/");
		
		//排序
		for(int i = 0;i < stu.length - 1;i++) {
			for(int j = 0;j < stu.length - 1 - i;j++) {
				if(stu[j].score > stu[j + 1].score) {
					//Student temp = new Student();
					//(不用在堆中重建，直接可以定义在栈中)
					Student temp = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		
		//输出
		for(int i = 0;i < stu.length;i++) {
//				System.out.println("学生的编号是 " + stu[i].number);
//				System.out.println("学生的年级是 " + stu[i].state);
//				System.out.println("学生的成绩是 " + stu[i].score);
//				System.out.println();
			System.out.println(stu[i].info());
		}
		
		
	}
}


class Student{
	int number;
	int state;
	int score;
	
	//显示学生的信息
	public String info() {
//		System.out.println("学生的编号是 " + number);
//		System.out.println("学生的年级是 " + state);
//		System.out.println("学生的成绩是 " + score);
//		System.out.println();
		
		return "学生的编号是 " + number 
				+ "\n学生的年级是" + state 
				+ "\n学生的成绩是 " + score + "\n";
	}
}




