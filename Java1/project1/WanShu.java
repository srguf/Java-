/*
���1000���ڵ�����
*/

class WanShu{
	public static void main(String[] args){
		int count = 0;
		for(int i = 4; i <1000; i++){
			int wanShu = 1;
			for(int j = 2; j <= i / 2; j++){
				if(i % j == 0){
					wanShu += j;
				}
			}
			if(wanShu == i){
				System.out.println(wanShu);
				count++;
			}
		}
		System.out.println("��������" + count + "��");
	}
}