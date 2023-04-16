package Exer_Wrapper;

import java.util.Scanner;
import java.util.Vector;

/*
 * 利用Vector代替数组，从键盘读入成绩(以负数代表结束)，找出最高分，并输出学生成绩等级
 * 提示:数组一旦创建，长度就固定不变，所以在创建数组时就需要知道他的长度
 * 	   而向量类java.util.Vector可以根据需要动态伸缩
 * 
 * 创建Vector对象：Vector v = new Vector();
 * 给向量添加元素：v.addElement(Object obj); //obj必须是对象
 * 取出向量中的元素：Object obj = v.elementAt(0);
 * 注意第一个下标是0，返回值是Object类型的。
 * 计算向量的长度：v.size();
 * 若与最高分相差10分内，A等；20分内，B等
 * 			30分内，C等；40分内，D等。
 * 
 */

public class WrapperTest2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//创建Vector对象,相当于原来的数组
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();
		
		int maxScore = 0;
		while(true) {
			System.out.println("请输入学生成绩：");
			int score = scan.nextInt();
			if(score < 0) {
				break;
			}
			if(score > 100) {
				System.out.println("输入有误，请重新输入");
				continue;
			}
//			Integer i = new Integer(score);  JDK5.0之前
//			v.addElement(v);                 JDK5.0之前
			v.addElement(score);//多态，自动装箱(JDK 5.0之后)
			
			if(maxScore < score) {
				maxScore = score;
			}
		}
		
		//遍历Vector，得到每个学生的成绩，并与最大值比较，得到每个学生的等级。
		char level;
		for(int i = 0;i < v.size();i++) {
			Object obj = v.elementAt(i);
			int n = (Integer)obj;
//			int m = (int)obj;
			
			if(maxScore - n <= 10) {
				level = 'A';
			}else if(maxScore - n <= 20) {
				level = 'B';
			}else if(maxScore - n <= 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("student " + (i + 1) + " score is "  + n 
					+ ",grade is " + level);
			
		}
		
		scan.close();
	}
}







