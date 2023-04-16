package Exer_TemplateMethod;

//按月记工资的员工处理
public class SalariedEmployee extends Employee{
	private double monthSalary;
	
	public SalariedEmployee(String name, int number, 
					MyDate birthday, double monthSalary) {
		super(name, number, birthday);
		this.monthSalary = monthSalary;
	}
	
	public double getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
	}

	@Override
	public String earnings() {
		return String.valueOf(this.monthSalary);
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + super.getName() 
				+ ", number=" + super.getNumber()
				+ ", birthday=" + super.getBirthday().toDateString() 
				+ ", monthSalary=" + this.monthSalary + "]";
	}

}
