package Exer_Abstract;

public class Manager extends Employee {
	@SuppressWarnings("unused")
	private double bonus;
	
	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}
	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("管理员工");
	}
	
	

}
