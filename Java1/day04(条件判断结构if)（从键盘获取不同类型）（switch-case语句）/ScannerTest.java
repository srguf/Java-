/*
��δӼ��̻�ȡ��ͬ���͵ı�������ҪScanner��

����ʵ�ֲ��裺
1.������import java.util.Scanner;  (util:���ã�utility���๦�ܹ��߰�)
2.Scanner��ʵ������Scanner scan = new Scanner(System.in);
3.����Scanner�����ط���( next()/nextXxx() )������ȡָ�����͵ı���
	//����char�͵Ļ�ȡ��Scannerû���ṩ��ط���
		//         ��ȡ�ַ������ַ������� + .charAt();  (����gender.charAt(0);��ָ��ȡ��һ���ַ���)����������
*/


import java.util.Scanner;
	//1.����

class ScannerTest{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
			//2ʵ����

		System.out.println("���������ͣ�");
		int num = scan.nextInt();
			//3.����Scanner�����ط���
		System.out.println(num);

		System.out.println("�������ַ�����");
		String string = scan.next();
		System.out.println(string);

		System.out.println("�����븡���ͣ�");
		double fudian = scan.nextDouble();
		System.out.println(fudian);

		System.out.println("�����벼���ͣ���true or false��");
		boolean boer = scan.nextBoolean();
		System.out.println(boer);


	}
}











