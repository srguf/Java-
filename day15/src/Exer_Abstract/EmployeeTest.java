package Exer_Abstract;

public class EmployeeTest {
	public static void main(String[] args) {
		//多态
		Employee manager = new Manager("库克", 1001, 5000, 50000);
		manager.work();
		System.out.println();
		
		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
	}
}
