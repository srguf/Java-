/*
Java�������������

һ. �������������������֣�

	������ֵ���ͣ�
		��ֵ�ͣ�	���Σ� byte  \  short \ int \ long
				�����ͣ� float \ double 
		�ַ��ͣ� char
		�����ͣ� boolean

	�����������ͣ�
		�ࣺ(class)        <- �ַ���������
		�ӿڣ�(interface)
		���飺(array)
��.���������е�λ�ã�
		��Ա���� vs �ֲ�����	
*/





class VariableTest1{
	public static void main(String[] args){
		
		//  1.���Σ�byte��1�ֽ�=8bit�� \  short(�ֽ�) \ int(4�ֽ�) \ long(8�ֽ�)
			
		//byte��Χ�� -128~127��
		
			//ͨ��ʹ��int�͡�
		short s1 = 128;
		int i1 = 1234;
		
			//����long�ͱ����������ԡ�l����L����β��
		long l1 = 34346464L;
		System.out.print("l1 = ");
		System.out.println( l1);
		System.out.println("l1 = " + l1);
		
		
		//  2.�����ͣ�float��4byte�� \  double(8byte)
			
		//float��ʾ��Χ��long����
		
			//����float���ͱ���ʱ������Ҫ��"f"��"F"��β��
		float f1 = 12.3F;
		System.out.println(f1);
			//ͨ�����帡���ͱ���ʱ��ʹ��double�͡�


		//  3.�ַ��ͣ�char��1�ַ� = 2�ֽڣ�
			//����char�ͱ�����ͨ��ʹ��һ�ԡ� ��,�ڲ�ֻ����һ���ַ���
		char c1 = 'A';
		//c1 = 'AB'; (���벻ͨ��)
		System.out.println(c1);

		char c2 = '1';
		//char c3 = '��'�������󣺺���ռ�����ֽڣ�
		char c4 = '��';
		System.out.println(c2);
		//System.out.println(c3);
		System.out.println(c4);

		
   		//���з� /n��
		//unicode��    ANSI��������Ϣ������׼�루American Standard coda for information interchange��
		
		// 4.�����ͣ�boolean
			//ֻ��ȡ����ֵ֮һ��true \ false
			//�����������жϡ�ѭ���ṹ��ʹ��
		boolean bb1 = true;
		System.out.println(bb1);

		
	}
}












