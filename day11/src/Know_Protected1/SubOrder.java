package Know_Protected1;

import Know_Protected.Order;

public class SubOrder extends Order{
	
	public void method() {
		
		//可调用protected类型的
		orderProtected = 1;
		orderPublic = 2;

		methodProtected();
		methodPublic();

		////不可调用private和Default类型的
//		orderDefault = 0;		
//		methodDefault();	
		
		
	}

}
