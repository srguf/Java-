/*
Ƕ��ѭ����ʹ��
1.Ƕ��ѭ������һ��ѭ���ṹA��������һ��ѭ���ṹB��ѭ�����У��͹�����Ƕ��ѭ��

2.���ѭ����ѭ���ṹB
   �ڲ�ѭ����ѭ���ṹA

3.˵��
(1)�ڲ�ѭ���ṹ����һ�飬ֻ�൱�����ѭ��ѭ����ִ����һ�� 
(2)�������ѭ����Ҫִ��m�Σ��ڲ�ѭ����Ҫִ��n�Σ���ʱ�ڲ�ѭ����һ��ִ���ˣ�m * n��

4.���ɣ�
���ѭ�������������ڲ�ѭ����������


���ӵģ�
1.	System.currentTimeMillis();
	���ã���ȡ1970-01-01   00��00��00�����ڵĺ�����(long��)

2.	Math.sqrt(i)
	���ã��࣬ȡi�ĸ�����

*/

class ForForTest{
	public static void main(String[] args){

		/*���⣺���  i                j
		*                    0               0+1
		**                  1               1+1
		***                 2               2+1         
		****               3               3+1         
		*****              4               4+1           
		*/

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < i+1; j++){
			System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();



/***************************************************/
/*���
     *         5
    * *       4
   * * *      3
  * * * *    2
 * * * * *  1
  * * * *    2   
   * * *     3
    * *       4
     *        5
*/
		//�ϰ벿��
		for(int i = 0; i < 5; i++){
			//���"_"
			for(int n = 0; n < 5 - i; n++){
				System.out.print(" ");
			}
			//�����"*_"
			for(int j = 0; j < i + 1; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	
		//�°벿��
		 for(int i = 0; i < 4; i++){
			//���"_"
			for(int n = 0; n < i + 2; n++){
				System.out.print(" ");
			}
			//�����"*_"
			for(int j = 0; j < 4 - i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();


	
/***********************************************************/
		/*�žų˷���
		1 * 1 = 1
		2 * 1 = 2   2 * 2 = 4
		.......
		9 * 1 = 9.....9 * 9 = 81
		
		*/
		for(int i = 1; i < 10; i++){
			for(int j = 1; j < i + 1; j++){
				int num = i * j;
				System.out.print( i + "*" + j + "="  + num + "   ");
			}
		System.out.println();
		}
		System.out.println();
		System.out.println(); 

/*******************************************************************************/

		long start = System.currentTimeMillis();
		//��ȡ1970-01-01   00��00��00�����ڵĺ�����(long��)
		


		//100���������������
		int flag = 0;
		//��������ȥ�������
		int count = 0;
/*label*/	for(int i = 2; i < 100; i++){
			flag = 0;
			for(int j = 2; j <= Math.sqrt(i); j++){
					//�Ż������Ա�������������Ȼ������Ч��
				if( i % j == 0){
					flag++;
					break;
					//��������ȥ��flag��break����Ϊcontinue label��
						//�Ż�1��ֻ�Ա������������Ȼ����Ч
				}
			}
			if(flag == 0){
				System.out.println( i );
			count++;
			}
			
		}
		
		long start1 = System.currentTimeMillis();
			//��ȡ1970-01-01   00��00��00�����ڵĺ�����(long��)
		long time = start1 - start;
		System.out.println("����Ϊ" + count);
		System.out.println( "���������ѵ�ʱ��Ϊ��" + time + "����");
			//���Ż���12ms
			//�Ż�һ��9ms
			//�Ż�һ + ����0ms


		/*   ע*  
		����100000
		���Ż���17110ms
		�Ż�һ��1546ms
		�Ż�һ + ����13ms
		�ҵĵ���1 + 2��502ms
		*/
	}
}











