/*
1.��д���򣺴Ӽ���������2019��ġ�month���͡�day��Ҫ��ͨ������������������Ϊ2019��ĵڼ��졣
2��15�� 31 + 15
5��7��31 + 28 + 31 + 30 + 7

2.��д���򣺴Ӽ����������꣬�£��գ��ж�����һ���еĵڼ���
ע���ж��Ƿ�������ı�׼��
	1�ɱ�4�����������ɱ�100����
	��
	2���Ա�400����

*/

import java.util.Scanner;

class SwitchCaseTest1monthday{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("������2019����·ݣ�");
		int month = scan.nextInt();
		System.out.println("������2019������ڣ�");
		int day = scan.nextInt();

		int sumDays = 0;
		
		switch(month){
			case 12:
				sumDays += 30;
					//11�µ�30��
			case 11:
				sumDays += 31;
					//10�µ�31��
			case 10:
				sumDays += 30;
					//9�µ�30��
			case 9:
				sumDays += 31;
					//8�µ�31��
			case 8:
				sumDays += 31;
					//7�µ�31��
			case 7:
				sumDays += 30;
					//6�µ�30��
			case 6:
				sumDays += 31;
					//5�µ�31��
			case 5:
				sumDays += 30;
					//4�µ�30��
			case 4:
				sumDays += 31;
					//3�µ�31��
			case 3:
				sumDays += 28;
					//2�µ�28��
			case 2:
				sumDays += 31;
					//1�µ�31��
			case 1:
				sumDays += day;
					//���µ�����
				break;
			default:
				System.out.println("������������");
			}
		System.out.println("2019��" + month + "��" + day + "��Ϊ2019��ĵ�" + sumDays + "��");

	}
}




class SwitchCaseTest1yearmonthday{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("��������ݣ�");
		int year = scan.nextInt();
		System.out.println("�������·ݣ�");
		int month = scan.nextInt();
		System.out.println("���������ڣ�");
		int day = scan.nextInt();
		
		int sumDays = 0;	
	
		switch(month){
			case 12:
				sumDays += 30;
					//11�µ�30��
			case 11:
				sumDays += 31;
					//10�µ�31��
			case 10:
				sumDays += 30;
					//9�µ�30��
			case 9:
				sumDays += 31;
					//8�µ�31��
			case 8:
				sumDays += 31;
					//7�µ�31��
			case 7:
				sumDays += 30;
					//6�µ�30��
			case 6:
				sumDays += 31;
					//5�µ�31��
			case 5:
				sumDays += 30;
					//4�µ�30��
			case 4:
				sumDays += 31;
					//3�µ�31��
			case 3:
				if(year / 400 == 0){
					sumDays += 28;
				}else{
					sumDays += 29;
				}
			case 2:
				sumDays += 31;
					//1�µ�31��
			case 1:
				sumDays += day;
					//���µ�����
				break;
			default:
				System.out.println("������������");
			}
		System.out.println(year + "��" + month + "��" + day + "��Ϊ" + year + "��ĵ�" + sumDays + "��");
		if(year / 400 == 0){
					System.out.println("������");
				}else{
					System.out.println("��������");
				}

	}
}


