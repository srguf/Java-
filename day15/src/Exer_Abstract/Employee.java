package Exer_Abstract;

public abstract class Employee {
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int id;
	@SuppressWarnings("unused")
	private double salary;
	
	public Employee() {
		super();
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
	
}
