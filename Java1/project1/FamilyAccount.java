import java.util.Scanner;

class FamilyAccount{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double allMoney = 10000;
		String details = "";
			//���ڼ�¼����֧����ϸ��
		
		i: while(true){
			System.out.println("------------------------��ͥ��֧�������------------------------\n");
			System.out.println("                          1 ��֧��¼");
			System.out.println("                          2 �Ǽ�����");
			System.out.println("                          3 �Ǽ����");
			System.out.println("                          4 ��    ��\n");
			System.out.println("--------------------------��ѡ��(1-4):--------------------------\n");

			int number = scan.nextInt();
			 switch(number){
				case 1:
					System.out.println("------------------------��ǰ��֧��ϸ��¼------------------------");
					System.out.println("����\t�˻����\t��֧���\t˵   ��");
					System.out.println(details);
					System.out.println("----------------------------------------------------------------\n\n");
					break;
				case 2:
					System.out.print("���������");
					double money1 = scan.nextDouble();
					System.out.print("��������˵����");
					String details1 = scan.next();
					System.out.println("--------------------------�Ǽ����--------------------------\n\n");
					
					allMoney +=money1;
					details += ("����\t" + allMoney +"\t\t" + money1 + "\t\t" + details1 + "\n");
						//����details
					break;
				case 3:
					System.out.print("����֧����");
					double money2 = scan.nextDouble();
					System.out.print("����֧��˵����");
					String details2 = scan.next();
					System.out.println("--------------------------�Ǽ����--------------------------\n\n");
					if(money2 <= allMoney){
						allMoney -=money2;
						details += ("֧��\t" + allMoney +"\t\t" + "-" + money2 + "\t\t" + details2 + "\n");
							//����details
					}else{
						System.out.println("��û���㹻�����");
					}
					break;
				case 4:
					System.out.println("ȷ���˳�����Y/N��");
					String yn = scan.next();
					char c = yn.charAt(0);

					if(c == 'y' || c == 'Y'){
						break i;
					}else if(c == 'n' || c == 'N'){
						continue;
					}else{
						System.out.println("���ɵ��\n\n");
						break;
					}

				default:
					System.out.println("����������");

			}

		}
		






	}
}