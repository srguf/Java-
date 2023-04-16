package Exer_Super;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account(1122,20000,0.043);
		
		acc.withdraw(3000);
		System.out.println("您的账户余额为：" + acc.getBalance());
		System.out.println();
		
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.println("您的账户余额为：" + acc.getBalance());
		System.out.println("月利率为：" + acc.getAnnuallnterestRate());
	}
}
