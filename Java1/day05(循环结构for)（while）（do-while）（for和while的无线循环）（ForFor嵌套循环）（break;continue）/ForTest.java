/*
Forѭ���ṹ��ʹ��
һ��ѭ���ṹ��4��Ҫ��
1.��ʼ������
2.ѭ������ ---boolean����++
3.ѭ����
4.��������

����forѭ���Ľṹ
for( (1) ; (2) ; (4) ){
	(3)
}

ִ�й��̣�1-2-3-4   -2-3-4  .....  2-3-4   -2-over;
*/

import java.util.Scanner;


class ForTest{
	public static void main(String[] args){
			
		int num = 1;
		for(System.out.print('a'); num <= 3; System.out.print('c'),num++){
			System.out.print('b');
		}
		System.out.println();
		System.out.println();
			//abc bc bc 
		

/************************************************************************************/
		//���⣺����100���ڵ�ż�������Ҽ�¼�������������ż���ĺ�

		System.out.println("���⣺����100���ڵ�ż��");
		int sum = 0;
		int count = 0;
		for(int i /*����i����forѭ������Ч��*/ = 0; i <= 100; i++){
			if( i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("cuont(ż���ĸ���) = " + count);
		System.out.println("sum(����ż���ĺ�) = " + sum);
		

		//��д����1��150������ÿ�д�ӡһֵ������ÿ���еı����д�ӡ��foo��5�ı�����ӡ��biz����7�ı�����ӡ��baz��
		
		System.out.println();
		System.out.println();
		System.out.println("��д����1��150������ÿ�д�ӡһֵ������ÿ���еı����д�ӡ��foo��5�ı�����ӡ��biz����7�ı�����ӡ��baz��");
		for(int i = 0; i < 150; i++){
			System.out.print(i + "  ");
			if(i % 3 == 0){
				System.out.print("foo ");
			}
			if(i % 5 == 0){
				System.out.print("biz ");
			}
			if(i % 7 == 0){
				System.out.print("baz ");
				System.out.println();
			}else{
				System.out.println();
			}
		}
	}
}		




//��������������m��n�������Լ������С������


class ForTest1{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("��������������m��n�������Լ������С������");
		System.out.println("����������m");
		int m = scan.nextInt();
		System.out.println("����������n");
		int n = scan.nextInt();

		int min = (m < n)? m : n;
		int max = (m > n)? m : n;

		for(int i = min; i <= m && i<=n; i--){
			if(m % i == 0 && n % i == 0){
				System.out.println("m��n�����Լ��Ϊ" + i);
				break;
			}
		}
		for(int i = max; i <= m * n; i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("m��n����С��������Ϊ" + i);
				break;
			}
		}
	}
}















