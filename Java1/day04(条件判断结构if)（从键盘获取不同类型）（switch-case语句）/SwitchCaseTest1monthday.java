/*
1.编写程序：从键盘上输入2019年的“month”和“day”要求通过程序输出输入的日期为2019年的第几天。
2，15： 31 + 15
5，7：31 + 28 + 31 + 30 + 7

2.编写程序：从键盘上输入年，月，日，判断这是一年中的第几天
注：判断是否是闰年的标准：
	1可被4整除，但不可被100整除
	或
	2可以被400整除

*/

import java.util.Scanner;

class SwitchCaseTest1monthday{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("请输入2019年的月份：");
		int month = scan.nextInt();
		System.out.println("请输入2019年的日期：");
		int day = scan.nextInt();

		int sumDays = 0;
		
		switch(month){
			case 12:
				sumDays += 30;
					//11月的30天
			case 11:
				sumDays += 31;
					//10月的31天
			case 10:
				sumDays += 30;
					//9月的30天
			case 9:
				sumDays += 31;
					//8月的31天
			case 8:
				sumDays += 31;
					//7月的31天
			case 7:
				sumDays += 30;
					//6月的30天
			case 6:
				sumDays += 31;
					//5月的31天
			case 5:
				sumDays += 30;
					//4月的30天
			case 4:
				sumDays += 31;
					//3月的31天
			case 3:
				sumDays += 28;
					//2月的28天
			case 2:
				sumDays += 31;
					//1月的31天
			case 1:
				sumDays += day;
					//本月的天数
				break;
			default:
				System.out.println("您的输入有误");
			}
		System.out.println("2019年" + month + "月" + day + "日为2019年的第" + sumDays + "天");

	}
}




class SwitchCaseTest1yearmonthday{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		System.out.println("请输入日期：");
		int day = scan.nextInt();
		
		int sumDays = 0;	
	
		switch(month){
			case 12:
				sumDays += 30;
					//11月的30天
			case 11:
				sumDays += 31;
					//10月的31天
			case 10:
				sumDays += 30;
					//9月的30天
			case 9:
				sumDays += 31;
					//8月的31天
			case 8:
				sumDays += 31;
					//7月的31天
			case 7:
				sumDays += 30;
					//6月的30天
			case 6:
				sumDays += 31;
					//5月的31天
			case 5:
				sumDays += 30;
					//4月的30天
			case 4:
				sumDays += 31;
					//3月的31天
			case 3:
				if(year / 400 == 0){
					sumDays += 28;
				}else{
					sumDays += 29;
				}
			case 2:
				sumDays += 31;
					//1月的31天
			case 1:
				sumDays += day;
					//本月的天数
				break;
			default:
				System.out.println("您的输入有误");
			}
		System.out.println(year + "年" + month + "月" + day + "日为" + year + "年的第" + sumDays + "天");
		if(year / 400 == 0){
					System.out.println("是闰年");
				}else{
					System.out.println("不是闰年");
				}

	}
}


