/*
�����֮һ�����������
+	-	+	- 	* 	/ 	%	(ǰ)++	(��)++ 	 (ǰ)-- 	 (��)--

*/


class AriTest{
	public static void main(String[] args){
		//���ţ�/
		int num1 = 12;
		int num2 = 5;
		
		int result1 = num1 / num2;
		System.out.println(result1);
			//2	(int�Ͳ�����С����)

		int result2 = num1 / num2 * num2;
		System.out.println(result2);	
			//12	(������Ϊ�Ƚ�����num1 / num2)
			//10	(��ȷ)

		double result3 = num1 / num2;
		System.out.println(result3);
			//2.0 	( num1 / num2 �����Ϊint��)����⣺�ȵó�num1 / num2��ֵ��Ȼ���ٸ�ֵ��result3��

		double result4 = (double)num1 / num2;
		System.out.println(result4);
			//2.4	(��ȷ)

		
		
		//%��ȡ�����㣨ȡģ���㣩�������г������ж��ܷ񱻳����������
			//��������뱻ģ����ͬ
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//2
		
		int m2 = -12;
		int n2 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//-2
		
		int m3 = 12;
		int n3 = -5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//2

		int m4 = -12;
		int n4 = -5;
		System.out.println("m1 % n1 = " + m1 % n1);
			//-2

		
		//(ǰ)++��������1��������
		//(��)++�������㣬������1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1);
			//11, 11

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2);
			//11, 10

		//ע��㣺
		short s1 = 10;
			//s1 = s1 + 1;(����ʧ��)
			//s1 = (short)(s1 + 1);(��ȷ)
		s1++;
			//��������ı䱾�����������
		System.out.println(s1);
			//11
		 //���⣺
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);
			//-128( 0111 1111 + 1 = 1000 0000 (-128) ) ( 1111 1111 = -127;�涨-128����1000 0000)
		

		//(ǰ)--�����Լ�1��������
		//(��)--�������㣬���Լ�1



/*
���⣺
����153����£���ʾ���£�
��λ����1
ʮλ����5
��λ����3
*/

		int num = 187;
		int bai = num / 100;
		int shi = num / 10 % 10;
		int ge = num % 10;
		System.out.println("����Ϊ187�������" );
		System.out.println("��λ�� = " + bai);
		System.out.println("ʮλ�� = " + shi);
		System.out.println("��λ�� = " + ge);

		
	}

}





























