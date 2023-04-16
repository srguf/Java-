		
/*
100以内所有质数输出
*/


class ZhiShu{
	public static void main(String[] args){

		long start = System.currentTimeMillis();
		//获取1970-01-01   00：00：00到现在的毫秒数(long型)
		

		//100以内所有质数输出
		int flag = 0;
		//方法二：去掉上面的
		int count = 0;
/*label*/	for(int i = 2; i < 100; i++){
			flag = 0;
			for(int j = 2; j <= Math.sqrt(i); j++){
					//优化二：对本身是质数的自然数是有效的
				if( i % j == 0){
					flag++;
					break;
					//方法二：去掉flag和break，改为continue label；
						//优化1，只对本身非质数的自然数有效
				}
			}
			if(flag == 0){
				System.out.println( i );
			count++;
			}
			
		}
		
		long start1 = System.currentTimeMillis();
			//获取1970-01-01   00：00：00到现在的毫秒数(long型)
		long time = start1 - start;
		System.out.println("个数为" + count);
		System.out.println( "程序所花费的时间为：" + time + "毫秒");
			//不优化：12ms
			//优化一：9ms
			//优化一 + 二：0ms


		/*   注*  
		若是100000
		不优化：17110ms
		优化一：1546ms
		优化一 + 二：13ms
		我的电脑1 + 2：502ms
		*/
	}
}
