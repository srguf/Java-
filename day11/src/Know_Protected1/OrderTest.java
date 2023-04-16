package Know_Protected1;

import Know_Protected.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.orderPublic = 1;
		order.methodPublic();
		
		//不可调用protected类型的
//		order.orderProtected = 0;
//		order.methodProtected();
		
	}
}
