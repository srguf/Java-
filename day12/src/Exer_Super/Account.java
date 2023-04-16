package Exer_Super;

public class Account {
	private int id;
	private double balance;
	private double annuallnterestRate;
	
	public Account(int id, double balance, double annuallnterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
	//返回月利率
	public double getMonthlyinteres() {
		return this.annuallnterestRate / 12;
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("您的余额不足");
			System.out.println("您的账户余额为：" + this.balance);
		}else {
			this.balance -= amount;
			System.out.println("取款成功");
		}
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("存款成功");
	}
	
}
