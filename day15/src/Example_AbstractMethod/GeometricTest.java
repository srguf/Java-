package Example_AbstractMethod;

/*
 * 定义一个测试类GeometricTest
 * 编写equalsArea方法测试两个对象的面积是否相等
 * 编写displayGeometricObject方法显示对象的面积
 * 
 */

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle("white", 1.0, 2.3);
		System.out.println("面积为：" + test.displayGeometricObject(c1));
		
		Circle c2 = new Circle("white", 1.0, 3.3);
		System.out.println("面积为：" + test.displayGeometricObject(c2));
		
		if(test.equalsArea(c1, c2)) {
			System.out.println("相等");
		}else {
			System.out.println("不等");
		}
		
		MyRectangle r1 = new MyRectangle("red", 2.0, 2.1, 3.4);
		System.out.println("面积为：" + test.displayGeometricObject(r1));
		
	}
	
	public boolean equalsArea(GeometricObject m,GeometricObject n) {
//		if(m == n) {
//			return true;
//		}else {
//			return false;
//		}
		return m.findArea() == n.findArea();
	}
	
	public double displayGeometricObject(GeometricObject m) {
		return m.findArea();
	}
	
}
