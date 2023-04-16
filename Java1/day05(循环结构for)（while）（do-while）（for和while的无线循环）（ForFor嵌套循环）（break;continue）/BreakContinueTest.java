/*
break和continue关键字的使用
			使用范围		循环使用中中的作用		相同点
break：		switch-case				
			循环结构中		结束当前循环			关键字后不能声明执行语句

continue		循环结构中		结束当次循环			关键字后不能声明执行语句

注：
1.break,continue默认结束最近的一层循环
2.可以结束指定标识的循环

*/

class BreakContinueTest{
	public static void main(String[] args){
		for(int i = 1;i <= 10 ;i++){
			if(i % 4 ==0){
				break;
					//123
				//continue;
					//1235678910
				//System.out.println("作者吱吱吱吱吱吱吱吱");
					//无法运行
			}
			System.out.println(i);
		}
/**********************************************************************************/
		label: for(int i = 1;i <= 4; i++){
				for(int j = 1;j <= 10; j++){
					if(j % 4 == 0){
						//break lable;
							//结束指定标识的一层循环结构
						continue label;
							//结束指定标识的一层当次循环
					}
					System.out.println(j);
				}
			}
			System.out.println();

	}

}