/*
分支结构中的if-else（条件判断结构）

一、三种结构
第一种：
if(条件表达式){
}

第二种：二选一
if(条件表达式){
	执行表达式1
}else{
	执行表达式2
}

第三种：多选一
if(条件表达式){
	执行表达式1
}else if(条件表达式){
	执行表达式2
}else if(条件表达式){
	执行表达式3
}
…………
else{

}

*/

class IfTest{
	public static void main(String[] args){
		//举例
		int age = 23;
		if(age < 0){
			System.out.println("您输入数据非法");
		}else if(age < 18){
			System.out.println("青少年时期");
		}else if(age <35){
			System.out.println("青壮年时期");
		}else if(age < 60){
			System.out.println("中年时期");
		}else if(age < 120){
			System.out.println("老年时期");
		}else{
			System.out.println("你是要成仙");
		}



		//例题：
		int xx = 4;
		int yy = 1;
		if (xx > 2)
			if(yy > 2)
				System.out.println(xx + yy);
			else//就近原则
				System.out.println("xx is " + xx);o


		
	

	}
}













