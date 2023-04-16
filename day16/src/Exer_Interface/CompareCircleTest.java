package Exer_Interface;

public class CompareCircleTest {
	public static void main(String[] args) {
		
		CompareCircle c1 = new CompareCircle(3.4);
		CompareCircle c2 = new CompareCircle(3.6);
		
		compare(c1.compareTo(c2));
		System.out.println();
		
		compare(c1.compareTo(new String("AA")));
		
	}
	
	public static void compare(int i) {
		if(i == 0) {
			System.out.println("两者相等");
		}else if(i > 0) {
			System.out.println("前者较大");
		}else {
			System.out.println("后者较大");
		}
	}
}
