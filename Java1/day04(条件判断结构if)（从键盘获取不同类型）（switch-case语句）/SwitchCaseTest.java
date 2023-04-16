/*
分支结构之二：switch-case

1.格式：
switch(表达式){
case 常量1：
	执行语句1；
	//break;

case 常量2：
	执行语句2；
	//break；

……

default:
	执行语句n；
	//break;


2.说明：
1 根据switch表达式中的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应的case结构中，调用其执行语句。
   当调用完执行语句后，则仍然继续向下执行其他的case结构中的执行语句，直到遇到break关键字或switch结构末尾结束为止。

2 switch结构中的表达式，只能是如下的6种数据类型之一：byte，short，char，int，枚举类型(JDK5.0增)，String类型(JDK7.0新增)。

3 case之后只能声明常量。不能声明范围。

4 break关键字是可选的。

5 default相当于if-else结构中的else。
   default同样是可选的，并且位置是灵活的

3.如果switc-擦结构中多个case执行语句相同，则可以考虑合并

*/

class SwitchCaseTest{
	public static void main(String[] args){
		int number = 3;
		
	switch(number){
		case 0:	
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other");
			break;
		}

/**********************************************************/
		
		//例题：成绩大于60分，输出“合格”。低于60分，输出“不合格”

		int socre = 78;
		switch(socre / 10){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不及格");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		fefault:
			System.out.println("及格");
			break;
		}




	}
}


