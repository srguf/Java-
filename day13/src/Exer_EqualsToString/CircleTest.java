package Exer_EqualsToString;

/*
 * 写一个测试类，判断两个对象颜色是否相同
 * 判断半径是否相同，用toString输出其半径
 */

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.3);
		Circle c2 = new Circle(2.3, "white", 2.0);
		
		System.out.println("颜色是否相等：" + c1.getColor().equals(c2.getColor()));
		
		System.out.println("半径是否相同：" + c1.radiusEquals(c2));
		System.out.println("c1半径为" + c1.toString());
		System.out.println("c2半径为" + c2.toString());
		
		System.out.println("c1、c2属性是否相同：" + c1.equals(c2));
		
	}
}
