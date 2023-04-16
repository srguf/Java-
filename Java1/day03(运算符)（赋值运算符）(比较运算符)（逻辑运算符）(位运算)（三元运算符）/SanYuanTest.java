/*
运算符之六：三元运算符
1.结构：（条件表达式)？表达式1：表达式2
（1对应true，2对应false）
  (表达式1，表达式2应当统一为一个类型)

2.说明：
条件表达式的结果为boolean类型
根据表达式真或假执行表达式1或2

3.凡是可以使用三元运算符的地方，都可以改写为if-else
反之，不成立。（例：n，m类型无法兼容）

4.两者都可使用时，推荐三元
*/

class SanYuanTest{
	public static void main(String[] args){
	//获取两整数的较大值
	int m = 12;
	int n = 5;
	
	int max = (m > n) ? m : n;
	System.out.println(max);
		//12
	double num = (n < m) ? 2 : 1.0;
		//2.0
	String maxStr = (m > n)? "m大" : ( (m == n)? "m与n相等" : "n大" ) ;
		//可嵌套
	}
}

















