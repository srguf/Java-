/*
�����֮�ģ��߼������
&	&&����·�룩	|	||����·��		^�������ţ�
˵����
1.�߼�����������Ķ���boolean���͵ı���


*/

class LogicTest{
	public static void main(String[] args){
		
		//����& ��&& !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//��ͬ��1��%��&&��������ͬ
		//��ͬ��2���������Ϊtrueʱ������ִ�з����ұߵ�����
		//��ͬ�㣺���������Ϊfalseʱ��&����ִ���ұߵ����㣬&&��������ұߵ�����(������ǰfalse�����false)
		
		boolean b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0) ){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		
		System.out.println("num1 = " + num1);
			//num = 11


		boolean b2 = false;
		int num2 = 10;
		if(b2 && (num2++ > 0) ){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		
		System.out.println("num2 = " + num2);
			//num = 10


		// |	��	|| 1ͬ��
		//��ͬ��2���������Ϊfalseʱ������ִ�з����ұߵ�����
		//��ͬ�㣺���������Ϊtrueʱ��| ����ִ���ұߵ����㣬|| ��������ұߵ����㣨������ǰtrue�����true��

			//�������Ƽ�ʹ�ö�·����



	}
}












