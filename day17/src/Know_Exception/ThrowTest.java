package Know_Exception;

public class ThrowTest {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.regist(-1001);
		System.out.println(s);
	}
}


class Student{
	@SuppressWarnings("unused")
	private int id;
	
	public void regist(int id) {
		if(id > 0) {
			this.id = id;
		}else {
			throw new RuntimeException("您输入数据非法！");
		}
	}
}