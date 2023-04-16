package Text;

import java.util.Scanner;

public class MyDateText {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MyDateText test = new MyDateText();
		MyDate[] md = new MyDate[2];
		
		//赋值
		System.out.println("请输入你的生日");
		test.value(md, scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println("请输入你女友的生日");
		test.value(md, scan.nextInt(), scan.nextInt(), scan.nextInt());
		
		//输出
		test.print(md);
		
		scan.close();
	}
	
	/**
	 * 赋值操作
	 * @param mdd 数组形参
	 * @param m year
	 * @param n month
	 * @param v day
	 */
	public void value(MyDate[] mdd,int m,int n,int v) {
		for(int i = 0;i < mdd.length;i++) {
			mdd[i] = new MyDate();
			
			mdd[i].year = m;
			mdd[i].month = n;
			mdd[i].day = v;
			
		}
	}
	
	public void print(MyDate[] mddd) {
		for(int i = 0;i < mddd.length;i++) {
			System.out.println(mddd[i].info());
		}
	}
	
}


class MyDate{
	int year;
	int month;
	int day;
	
	public String info() {
		return  year + "年\n"
				+ month + "月\n" 
				+ day + "日\n";
	}
}

