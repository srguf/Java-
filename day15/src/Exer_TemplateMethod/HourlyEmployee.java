package Exer_TemplateMethod;

//按小时计算工资的员工处理
public class HourlyEmployee extends Employee{
	private double wage;//每小时工资；报酬
	private double hour;//月工作时长

	public HourlyEmployee(String name, int number, 
			MyDate birthday, double wage, double hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}

	@Override
	public String earnings() {
		return String.valueOf(this.wage * this.hour);
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + super.getName() 
				+ ", number=" + super.getNumber()
				+ ", birthday=" + super.getBirthday().toDateString() 
				+ ", wage=" + this.wage 
				+ ", hour=" + this.hour + "]";
	}

}
