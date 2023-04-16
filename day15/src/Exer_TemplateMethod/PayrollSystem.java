package Exer_TemplateMethod;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 输出员工信息，并打印earn的money
 * 若今天是员工的生日，则输出增加工资信息。
 * 
 */

public class PayrollSystem {
	public static void main(String[] args) {
		//方式一
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入当月的月份");
		int month = scan.nextInt();
		
		//方式二
		Calendar calendar = Calendar.getInstance();
		int month1 = calendar.get(Calendar.MONTH);//获取当前月份
		System.out.println((month1 + 1) + "月");//一月是0，所以加一
		
		Employee[] emps = new Employee[2];
		emps[0] = new SalariedEmployee
				("张三", 1002, new MyDate(1992, 02, 28), 10000);
		emps[1] = new HourlyEmployee
				("李四", 2001, new MyDate(1991, 05, 06), 60, 240);
		
		for(int i = 0; i < emps.length; i++) {
			System.out.println(emps[i].toString());
			System.out.println("earn\t" + emps[i].earnings());
			
			if(month == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！\tbonus + 100！");
				System.out.println("计算后工资为：" 
				+ (Double.parseDouble(emps[i].earnings()) + 100));
			}
		}
		scan.close();
	}
	
}
