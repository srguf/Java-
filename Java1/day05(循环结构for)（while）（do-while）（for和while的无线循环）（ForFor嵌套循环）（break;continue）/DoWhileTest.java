/*
do-whileѭ����ʹ��

һ��ѭ���ṹ��4��Ҫ��
1.��ʼ������
2.ѭ������ ---boolean����++
3.ѭ����
4.��������

����do-whileѭ���ṹ��
(1)
do{
	(3);
	(4); 
}while( (2) );

ִ�й��̣�1-3-4-2   -3-4-2  -3-4-2  ....   3-4-2-over;

˵����
1.do-whlieѭ�����ٻ�ִ��һ�Σ�����������������
2.�����У�ʹ��forѭ����whileѭ������һЩ������ʹ��do-while.

*/


class DoWhileTest{
	public static void main(String[] args){

		//����100���ڵ�ż����������������Ŀ�ĺͼ�ż������
		int i = 0;
		int sum = 0;
		int count = 0;
		do{
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
			i++;
		}while(i <= 100);
		System.out.println("����ż���ĺ�Ϊ" + sum);
		System.out.println("һ����" + count + "��ż��");
	}
}













