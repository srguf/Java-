/*
String���ͱ�����ʹ��
1.String���������������ͣ�class��������Ϊ���ַ���
2.����String���ͱ���ʱ��ʹ��һ��""
3.String���Ժ�8��7��+boolean�������ݻ����������������㣬������ֻ�����������㣺+
4.������ΪString����
*/
class StringText{
	public static void main(String[] args){
	
		String s1 = "Hello World!";
		System.out.println(s1);
		String s2 = "a";

		char c = 'a';
		System.out.println(c);

		/***********************************************************************/
		
		int number = 1001;
		String numberStr = "ѧ��:";
		String info = numberStr + number;// +���������㣨��ǰ��������String��ʱ���������Ϊ����ӣ�
		boolean b1 = true;
		String info1 = info + b1;// +����������
		System.out.println(info1);

		/***********************************************************************/
		
		//��ϰ
		char c1 = 'a';//a = 97, A = 65
		int num = 10;
		String str = "hello";
		
		System.out.println(c1 + num + str);
			//107hello
		System.out.println(c1 + str + num);
			//ahello10
		System.out.println(c1 + (num + str) );
			//a10hello
		System.out.println( (c1 + num) + str);
			//107hello
		System.out.println(str + num + c1);
			//hello10a

		
		//��ϰ2
		//���*	*���м�ΪTap����(\t)
		System.out.println("*	*");
			//*	*
		System.out.println('*' + '	' + '*');
			//93
		System.out.println('*' + '\t' + '*');
			//93
		System.out.println('*' + "\t" + "*");
			//*	*
		System.out.println('*' + '\t' + "*");
			//51*
		System.out.println('*' + ('\t' + "*") );
			//*	*
		System.out.println("*" + "\t" + "*");
			//*	*
		
	}
}



















