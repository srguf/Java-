package Exer_Account;

public class Account {
	private int id;//账号
	private double balance;//余额
	private double annuallnterestRate;//年利率
	
	//构造体
	public Account(int id,double balance,double annuallnterestRate) {
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}
	
	//方法
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
	
	//取钱
	public void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("您的余额不足,取款失败");
		}else {
			balance -= amount;
			System.out.println("成功取出：" + amount);
		}
	}
	
	//存钱
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("成功存入：" + amount);
		}else {
			System.out.println("您不能存入负数");
		}
	}
	
}





