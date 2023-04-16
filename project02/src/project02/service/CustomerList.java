package project02.service;

import project02.bean.Customer;

/**
 * 
 * CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，并提供
 * 相应的添加、修改、删除、和遍历方法，供CustomerView调用
 * @author 12898
 *
 */
public class CustomerList {
	private Customer[] customers;//用来保存对象的数组
	private int total = 0;//个数
	
	//构造体
	public CustomerList() {
		customers = new Customer[10];
		customers[0] = new Customer("郭先生",'男',20,"15159667850","guanji473730@163.com");
		total++;
		customers[1] = new Customer("张女士",'女',23,"151855685480","guanji@126.com");
		total++;
		customers[2] = new Customer("李先生",'男',21,"159455685480","1289823376@126.com");
		total++;
	}
/**
 * 构造体
 * @param number：指定数组的长度
 */
	public CustomerList(int number) {
		customers = new Customer[number];
		customers[0] = new Customer("郭先生",'男',20,"15159667850","guanji473730@163.com");
		total++;
		customers[1] = new Customer("张女士",'女',23,"151855685480","guanji@126.com");
		total++;
		customers[2] = new Customer("李先生",'男',21,"159455685480","1289823376@126.com");
		total++;
	}
	
	
	
	/**
	 * 将指定的客户添加到数组中
	 * @param customer
	 * @return true：添加成功 false：添加失败
	 */
	public boolean addCustomer(Customer customer) {
		
		if(total >= customers.length) {
			return false;
		}
		
		customers[total++] = customer;
		return true;
	}
	/**
	 * 修改指定位置的客户索引信息
	 * @param index 数组的地址索引
	 * @param cust 数组
	 * @return true：修改成功 false：修改失败
	 */
	public boolean replaceCustomer(int index,Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		
		customers[index] = cust;
		return true;

	}
	/**
	 * 删除指定位置的客户
	 * @param index 数组下标
	 * @return true：删除成功 false：删除失败
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		//删除移位部分
		for(int i = index;i < total - 1;i++) {
			customers[index] = customers[index + 1];
		}
		//最后的元素需要置空
		customers[--total] = null;
//		或：customers[total - 1] = null;
//		total--;
		return true;
		
	}
	/**
	 * 获取所有的客户信息
	 */
	public void getAllCustomer() {
		for(int i = 0;i < total;i++) {
			System.out.println((i + 1) + "\t" +
					customers[i].getName() + "\t" + 
					customers[i].getAge() + "\t" + 
					customers[i].getGender() + "\t" + 
					customers[i].getPhone() + "\t" + 
					customers[i].getEmail() + "\t\t");
		}
	}
	/**
	 * 获取指定位置上的客户
	 * @param index
	 * @return 返回的是指定类型位置的一个地址
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	/**
	 * 获取存储的客户的数量
	 * @return 数量
	 */
	public int getTotal() {
		return total;
	}
	
	public Customer[] getCustomer() {
		return customers;
	}
}





