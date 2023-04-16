package Exer_Super;

public class CheckAccount extends Account {
	private double overdraft;

	public CheckAccount(int id, double balance, double annuallnterestRate, int overdraft) {
		super(id, balance, annuallnterestRate);
		this.overdraft = overdraft;
	}
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if(super.getBalance() >= amount) {//余额足够消费
			//方式一
//			super.setBalance(super.getBalance() - amount);
			//方式二
			super.withdraw(amount);
		}else if(amount - super.getBalance() <= overdraft) {//透支足够消费
			overdraft = overdraft + super.getBalance() - amount;
			super.setBalance(0);
		}else {
			System.out.println("取款失败，您没有足够的透支额度");
		}
		
	}
	
	
	
}
