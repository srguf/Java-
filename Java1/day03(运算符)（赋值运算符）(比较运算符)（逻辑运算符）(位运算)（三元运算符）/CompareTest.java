/*
运算符之三：比较运算符
==	!=	>	<	>=	<=	instanceof

结论：
1.比较运算符的结果是boolean类型
2.区分 == 和 =
*/

class CompareTest{
	public static void main(String[] args){
		int i = 10;
		int j = 20;
		System.out.println(i == j);
			//fales
		System.out.println(i = j);
			//注意区分
	}
}