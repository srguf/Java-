/*
��֧�ṹ֮����switch-case

1.��ʽ��
switch(���ʽ){
case ����1��
	ִ�����1��
	//break;

case ����2��
	ִ�����2��
	//break��

����

default:
	ִ�����n��
	//break;


2.˵����
1 ����switch���ʽ�е�ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ����������Ӧ��case�ṹ�У�������ִ����䡣
   ��������ִ����������Ȼ��������ִ��������case�ṹ�е�ִ����䣬ֱ������break�ؼ��ֻ�switch�ṹĩβ����Ϊֹ��

2 switch�ṹ�еı��ʽ��ֻ�������µ�6����������֮һ��byte��short��char��int��ö������(JDK5.0��)��String����(JDK7.0����)��

3 case֮��ֻ����������������������Χ��

4 break�ؼ����ǿ�ѡ�ġ�

5 default�൱��if-else�ṹ�е�else��
   defaultͬ���ǿ�ѡ�ģ�����λ��������

3.���switc-���ṹ�ж��caseִ�������ͬ������Կ��Ǻϲ�

*/

class SwitchCaseTest{
	public static void main(String[] args){
		int number = 3;
		
	switch(number){
		case 0:	
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other");
			break;
		}

/**********************************************************/
		
		//���⣺�ɼ�����60�֣�������ϸ񡱡�����60�֣���������ϸ�

		int socre = 78;
		switch(socre / 10){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		fefault:
			System.out.println("����");
			break;
		}




	}
}


