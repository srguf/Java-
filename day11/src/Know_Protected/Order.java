package Know_Protected;

/*
 * 体会4种不同的权限
 * 
 * 
 */

public class Order {
	@SuppressWarnings("unused")
	private int orderPrivate;
	int orderDefault;
	protected int orderProtected;
	public int orderPublic;
	
	@SuppressWarnings("unused")
	private void methodPrivate() {
		
	}
	void methodDefault() {
		
	}
	protected void methodProtected() {
		
	}
	public void methodPublic() {
		
	}
	
	
}
