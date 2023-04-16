package project02.bean;

/**
 * Customer为实体对象，用来封装客户信息
 * @author 12898
 *
 */
public class Customer {
	private String name;
	private char gender;//性别
	private int age;
	private String phone;
	private String email;
	
	//构造器
	public Customer() {
		
	}
	/**
	 * 
	 * @param name
	 * @param gender
	 * @param age
	 * @param phone
	 * @param email
	 */
	public Customer(String name, char gender, int age, String phone, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	
	//方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
