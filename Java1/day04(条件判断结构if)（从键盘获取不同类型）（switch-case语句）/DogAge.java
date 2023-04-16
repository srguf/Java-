/*
练习：计算狗的年龄
狗的前两年相当于人类10.5岁，后每一年增加4岁。
编写程序，获取用户输入年龄并显示对应人类年龄。若输入负数，则显示提示信息
*/
111
import java.util.Scanner;

class DogAge{
	public static void main(String[] args){
		
		System.out.println("请输入狗狗的年龄（整数）：");

		Scanner scan = new Scanner(System.in);
		
		int dogAge = scan.nextInt();
		
		if(dogAge <= 0){
			System.out.println("年龄不能是0或负数");
		}
		if(dogAge <= 2){
			System.out.println("狗狗的年龄相当于人类的" + ( (double)dogAge ) * 10.5 + "岁");
		}else if(dogAge > 2 && dogAge < 50){
			System.out.println("狗狗的年龄相当于人类的" + ( (double)dogAge ) * 10.5 + (dogAge - 2) * 4 + "岁");
		}else{
			System.out.println("很遗憾狗狗已经死了");
		}
	}
}











