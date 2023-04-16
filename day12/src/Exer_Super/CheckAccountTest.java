package Exer_Super;
	
public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 5000);
		
		ca.withdraw(5000);
		System.out.println("账户余额为：" + ca.getBalance()
					+ "\n可透支额为：" + ca.getOverdraft());
		System.out.println();
		
		ca.withdraw(18000);
		System.out.println("账户余额为：" + ca.getBalance()
					+ "\n可透支额为：" + ca.getOverdraft());
		System.out.println();
		
		ca.withdraw(3000);
		System.out.println("账户余额为：" + ca.getBalance()
					+ "\n可透支额为：" + ca.getOverdraft());
		System.out.println();
		
	}
}
