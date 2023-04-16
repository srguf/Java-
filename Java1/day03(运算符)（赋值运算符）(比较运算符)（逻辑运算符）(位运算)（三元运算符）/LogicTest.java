/*
运算符之四：逻辑运算符
&	&&（短路与）	|	||（短路或）		^（异或符号）
说明：
1.逻辑运算符操作的都是boolean类型的变量


*/

class LogicTest{
	public static void main(String[] args){
		
		//区分& 与&& !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//相同点1：%与&&运算结果相同
		//相同点2：符号左边为true时，都会执行符号右边的运算
		//不同点：当符号左边为false时，&继续执行右边的运算，&&则会跳过右边的运算(与运算前false结果必false)
		
		boolean b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0) ){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println("num1 = " + num1);
			//num = 11


		boolean b2 = false;
		int num2 = 10;
		if(b2 && (num2++ > 0) ){
			System.out.println("我现在在北京");
		}else{
			System.out.println("我现在在南京");
		}
		
		System.out.println("num2 = " + num2);
			//num = 10


		// |	与	|| 1同上
		//相同点2：符号左边为false时，都会执行符号右边的运算
		//不同点：当符号左边为true时，| 继续执行右边的运算，|| 则会跳过右边的运算（或运算前true结果必true）

			//开发中推荐使用短路符号



	}
}












