/*
������������֮����������

ǰ�᣺7�����ݱ������ͣ�������boolean���͡�

1.�Զ�����������
	������С���������͵ı�������������������͵ı���������ʱ������Զ�����Ϊ��������������͡�
	byte ��char �� short --> int --> long --> float --> double
	�ر�ģ���byte �� char �� short�������͵ı���������ʱ�����Ϊint��
		���γ���Ĭ��Ϊint��
		�������ͳ���Ĭ��Ϊdouble��

2.ǿ������ת����
	�Զ����������������㡣


˵������ʱ��������С��ʾ���ķ�Χ�Ĵ�С������float��������long
*/




class VariableTest2{
	public static void main(String[] args){
		
		System.out.println("�Զ���������");
		byte b1 = 2;
		int i1 = 129;
			//byte b2 = b1 + i1;   �����벻ͨ����
		int i2 = b1 + i1;
		long l1 = b1 + i1;
		System.out.println(i2);
		System.out.println(l1);

		float f = b1 + i1;
		System.out.println(f);

		short s1 = 123;
		double d1 = s1;
		System.out.println(d1);

		/**************************�ر��***************************/
		char c1 = 'a';//97
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
			//107

		byte b2 = 12;
		int i5 = c1 + b2;
		System.out.println(i5);
			//byte ��char �� short������Ϊint��


		
		
			//ǿ������ת��
		System.out.println("ǿ������ת��");
		double d2 = 12.3;
		int i6 = (int)d2;
		System.out.println(d2);
		System.out.println(i6);

	}
}















