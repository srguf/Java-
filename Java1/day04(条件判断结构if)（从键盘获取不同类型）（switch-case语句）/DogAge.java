/*
��ϰ�����㹷������
����ǰ�����൱������10.5�꣬��ÿһ������4�ꡣ
��д���򣬻�ȡ�û��������䲢��ʾ��Ӧ�������䡣�����븺��������ʾ��ʾ��Ϣ
*/
111
import java.util.Scanner;

class DogAge{
	public static void main(String[] args){
		
		System.out.println("�����빷�������䣨��������");

		Scanner scan = new Scanner(System.in);
		
		int dogAge = scan.nextInt();
		
		if(dogAge <= 0){
			System.out.println("���䲻����0����");
		}
		if(dogAge <= 2){
			System.out.println("�����������൱�������" + ( (double)dogAge ) * 10.5 + "��");
		}else if(dogAge > 2 && dogAge < 50){
			System.out.println("�����������൱�������" + ( (double)dogAge ) * 10.5 + (dogAge - 2) * 4 + "��");
		}else{
			System.out.println("���ź������Ѿ�����");
		}
	}
}











