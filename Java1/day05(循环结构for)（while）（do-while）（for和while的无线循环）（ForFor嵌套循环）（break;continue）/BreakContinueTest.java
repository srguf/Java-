/*
break��continue�ؼ��ֵ�ʹ��
			ʹ�÷�Χ		ѭ��ʹ�����е�����		��ͬ��
break��		switch-case				
			ѭ���ṹ��		������ǰѭ��			�ؼ��ֺ�������ִ�����

continue		ѭ���ṹ��		��������ѭ��			�ؼ��ֺ�������ִ�����

ע��
1.break,continueĬ�Ͻ��������һ��ѭ��
2.���Խ���ָ����ʶ��ѭ��

*/

class BreakContinueTest{
	public static void main(String[] args){
		for(int i = 1;i <= 10 ;i++){
			if(i % 4 ==0){
				break;
					//123
				//continue;
					//1235678910
				//System.out.println("����֨֨֨֨֨֨֨֨");
					//�޷�����
			}
			System.out.println(i);
		}
/**********************************************************************************/
		label: for(int i = 1;i <= 4; i++){
				for(int j = 1;j <= 10; j++){
					if(j % 4 == 0){
						//break lable;
							//����ָ����ʶ��һ��ѭ���ṹ
						continue label;
							//����ָ����ʶ��һ�㵱��ѭ��
					}
					System.out.println(j);
				}
			}
			System.out.println();

	}

}