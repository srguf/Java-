		
/*
100���������������
*/


class ZhiShu{
	public static void main(String[] args){

		long start = System.currentTimeMillis();
		//��ȡ1970-01-01   00��00��00�����ڵĺ�����(long��)
		

		//100���������������
		int flag = 0;
		//��������ȥ�������
		int count = 0;
/*label*/	for(int i = 2; i < 100; i++){
			flag = 0;
			for(int j = 2; j <= Math.sqrt(i); j++){
					//�Ż������Ա�������������Ȼ������Ч��
				if( i % j == 0){
					flag++;
					break;
					//��������ȥ��flag��break����Ϊcontinue label��
						//�Ż�1��ֻ�Ա������������Ȼ����Ч
				}
			}
			if(flag == 0){
				System.out.println( i );
			count++;
			}
			
		}
		
		long start1 = System.currentTimeMillis();
			//��ȡ1970-01-01   00��00��00�����ڵĺ�����(long��)
		long time = start1 - start;
		System.out.println("����Ϊ" + count);
		System.out.println( "���������ѵ�ʱ��Ϊ��" + time + "����");
			//���Ż���12ms
			//�Ż�һ��9ms
			//�Ż�һ + ����0ms


		/*   ע*  
		����100000
		���Ż���17110ms
		�Ż�һ��1546ms
		�Ż�һ + ����13ms
		�ҵĵ���1 + 2��502ms
		*/
	}
}
