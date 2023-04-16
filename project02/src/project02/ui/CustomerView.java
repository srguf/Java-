package project02.ui;


import java.util.Scanner;

import project02.bean.Customer;
import project02.service.CustomerList;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author 12898
 */
public class CustomerView {
	Scanner scan = new Scanner(System.in);
	private CustomerList cust = new CustomerList();
	

	/**
	 * 显示《客户信息管理软件》的方法
	 */
	public void enterMainMenu() {
		
	m: 	while(true) {
			System.out.println();
			System.out.println("-------------客户信息管理软件-------------");
			System.out.println("               1.添加客户");
			System.out.println("               2.修改客户");
			System.out.println("               3.删除客户");
			System.out.println("               4.客户列表");
			System.out.println("               5.退  出");
			System.out.println("--------------------------------------");
			System.out.print("请选择(1 - 5):");
			
		n:	while(true) {
				int m = scan.nextInt();
				switch(m) {
					case 1:
						addNewCustomer();
						break n;
					case 2:
						modifyCustomer();
						break n;
					case 3:
						deleteCustomer();
						break n;
						case 4:
						listAllCustomer();
						break n;
					case 5:
						System.out.println("确定退出？(Y/N)");
							
						String nn = scan.next();
						char ch = nn.charAt(0);
							
						if(ch == 'n' || ch == 'N') {
							break n;
						}else if(ch == 'y' || ch == 'Y'){
							System.out.println("退出成功");
							break m;
						}else {
							System.out.println("退出失败");
						}
					default:
						System.out.println("选择错误，请重新输入：");
				}	
				
			}
		
		}
		scan.close();
		
	}
	/**
	 * 添加客户的操作
	 */
	private void addNewCustomer() {
		System.out.println();
		System.out.println("----------------添加客户----------------");
		Customer customer = new Customer();
		
		System.out.print("姓名：");
		customer.setName(scan.next());
		System.out.print("性别：");
		customer.setGender(scan.next().charAt(0));
		System.out.print("年龄：");
		customer.setAge(scan.nextInt());
		System.out.print("电话号码：");
		customer.setPhone(scan.next());
		System.out.print("电子邮箱：");
		customer.setEmail(scan.next());
		
		boolean isSuccess = cust.addCustomer(customer);
		if(isSuccess) {
			System.out.println("----------------添加完成----------------\n");
		}else {
			System.out.println("-----------客户数组已满，添加失败-----------\n");
		}
	}
	/**
	 * 修改客户的操作
	 */
	private void modifyCustomer() {
		System.out.println();
		System.out.println("----------------修改客户----------------");
		System.out.print("请选择待修改客户的编号(-1退出):");
		int number = scan.nextInt();
		if(number == -1) {
			return;
		}
		
		if(cust.getCustomer(number - 1) == null){
			System.out.println("无法找到指定客户");
		}else {
			System.out.print("姓名(" + cust.getCustomer(number).getName() + "):");
			String s = scan.next();
			if(s != "") {
				cust.getCustomer(number - 1).setName(s);
			}
			
			System.out.print("性别(" + cust.getCustomer(number).getGender() + "):");
			char ss = scan.next().charAt(0);
			if(ss != 0) {
				cust.getCustomer(number - 1).setGender(ss);
			}
			
			System.out.print("年龄(" + cust.getCustomer(number).getName() + "):");
			int sss = scan.nextInt();
			if(sss != 0) {
				cust.getCustomer(number - 1).setAge(sss);
			}
			
			System.out.print("电话号码(" + cust.getCustomer(number).getName() + "):");
			String ssss = scan.next();
			if(ssss != null) {
				cust.getCustomer(number - 1).setPhone(ssss);
			}
			
			System.out.print("邮箱(" + cust.getCustomer(number).getName() + "):");
			String sssss = scan.next();
			if(sssss != null) {
				cust.getCustomer(number - 1).setEmail(sssss);
			}
			
			System.out.println("----------------修改成功----------------\n");
			
		}
		
	}
	/**
	 * 删除客户的操作
	 */
	private void deleteCustomer() {
		System.out.println();
		System.out.println("----------------删除客户----------------");
		System.out.println("请选择想要删除的客户的编号(-1退出)");
		int number = scan.nextInt();
		if(number == -1) {
			return;
		}else {
			boolean isSuccess = cust.deleteCustomer(number - 1);
			
			if(isSuccess) {
				System.out.println("----------------删除成功----------------");
			}else {
				System.out.println("没有此编号的客户,删除失败");
			}
		}
	}
	/**
	 * 显示客户列表的操作
	 */
	private void listAllCustomer() {
		System.out.println();
		System.out.println("----------------客户列表----------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		if(cust.getTotal() == 0){
			System.out.println("没有客户记录!");
		}else {
			cust.getAllCustomer();
		}
		System.out.println("---------------客户列表完成--------------\n");
	}
	
	
	/**
	 * main方法
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerView cv = new CustomerView();
		cv.enterMainMenu();
		
		
	}
	
	
}
