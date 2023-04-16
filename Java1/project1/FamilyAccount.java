import java.util.Scanner;

class FamilyAccount{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double allMoney = 10000;
		String details = "";
			//用于记录收入支出的细节
		
		i: while(true){
			System.out.println("------------------------家庭收支记账软件------------------------\n");
			System.out.println("                          1 收支记录");
			System.out.println("                          2 登记收入");
			System.out.println("                          3 登记输出");
			System.out.println("                          4 退    出\n");
			System.out.println("--------------------------请选择(1-4):--------------------------\n");

			int number = scan.nextInt();
			 switch(number){
				case 1:
					System.out.println("------------------------当前收支明细记录------------------------");
					System.out.println("收入\t账户余额\t收支金额\t说   明");
					System.out.println(details);
					System.out.println("----------------------------------------------------------------\n\n");
					break;
				case 2:
					System.out.print("本次收入金额：");
					double money1 = scan.nextDouble();
					System.out.print("本次收入说明：");
					String details1 = scan.next();
					System.out.println("--------------------------登记完成--------------------------\n\n");
					
					allMoney +=money1;
					details += ("收入\t" + allMoney +"\t\t" + money1 + "\t\t" + details1 + "\n");
						//处理details
					break;
				case 3:
					System.out.print("本次支出金额：");
					double money2 = scan.nextDouble();
					System.out.print("本次支出说明：");
					String details2 = scan.next();
					System.out.println("--------------------------登记完成--------------------------\n\n");
					if(money2 <= allMoney){
						allMoney -=money2;
						details += ("支出\t" + allMoney +"\t\t" + "-" + money2 + "\t\t" + details2 + "\n");
							//处理details
					}else{
						System.out.println("你没有足够的余额");
					}
					break;
				case 4:
					System.out.println("确认退出？（Y/N）");
					String yn = scan.next();
					char c = yn.charAt(0);

					if(c == 'y' || c == 'Y'){
						break i;
					}else if(c == 'n' || c == 'N'){
						continue;
					}else{
						System.out.println("你个傻逼\n\n");
						break;
					}

				default:
					System.out.println("请重新输入");

			}

		}
		






	}
}