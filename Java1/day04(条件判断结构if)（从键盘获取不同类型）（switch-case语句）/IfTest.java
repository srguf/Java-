/*
��֧�ṹ�е�if-else�������жϽṹ��

һ�����ֽṹ
��һ�֣�
if(�������ʽ){
}

�ڶ��֣���ѡһ
if(�������ʽ){
	ִ�б��ʽ1
}else{
	ִ�б��ʽ2
}

�����֣���ѡһ
if(�������ʽ){
	ִ�б��ʽ1
}else if(�������ʽ){
	ִ�б��ʽ2
}else if(�������ʽ){
	ִ�б��ʽ3
}
��������
else{

}

*/

class IfTest{
	public static void main(String[] args){
		//����
		int age = 23;
		if(age < 0){
			System.out.println("���������ݷǷ�");
		}else if(age < 18){
			System.out.println("������ʱ��");
		}else if(age <35){
			System.out.println("��׳��ʱ��");
		}else if(age < 60){
			System.out.println("����ʱ��");
		}else if(age < 120){
			System.out.println("����ʱ��");
		}else{
			System.out.println("����Ҫ����");
		}



		//���⣺
		int xx = 4;
		int yy = 1;
		if (xx > 2)
			if(yy > 2)
				System.out.println(xx + yy);
			else//�ͽ�ԭ��
				System.out.println("xx is " + xx);o


		
	

	}
}













