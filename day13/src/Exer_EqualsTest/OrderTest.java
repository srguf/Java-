package Exer_EqualsTest;

/*
 * 重写equals练习
 * 
 */

public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order(1001,"AA");
		Order order2 = new Order(1001,"AA");
		Order order3 = new Order(1001,"BB");//字符串常量池
		Order order4 = new Order(1001,new String("BB"));//字符串对象
		
		System.out.println(order1.equals(order2));
		System.out.println(order1.equals(order3));
		System.out.println(order3.equals(order4));
		
	}

}

class Order{
	private int orderId;
	private String orderName;
	
	public Order() {
		super();
	}
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(obj instanceof Order) {
			Order ord = (Order)obj; 
			
			return this.orderId == ord.orderId 
					&& this.orderName.equals(ord.orderName);
		}
		return false;
	}
	
}

