/*
��Ŀ���Ӽ��̶���������ȷ�����������ж϶���������͸����ĸ���������0ʱ��������

˵����
1.����ѭ�������������ƴ����Ľṹ��for( ; ; )  ��  while(ture)
����ѭ���м��ַ�ʽ��
	һ����ѭ�������з���false
	������ѭ�����У�ִ��break��
*/

import java.util.Scanner;

class ForWhileTest{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
	
		int positive = 0;
		int negative = 0;
		
		while(true){    //for( ; ; ){     ��for����д��
			int number = scan.nextInt();
			if(number > 0){
				positive += 1;
			}else if(number < 0){
				negative += 1;
			}else{
				break;
			}
		}
	System.out.println("��" + positive +"������");
	System.out.println("��" + negative +"������");

	}
}