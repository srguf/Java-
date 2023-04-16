package Exer_Interface;

public class CompareCircle extends Circle implements CompareObject{
	
	public CompareCircle() {
		super();
	}
	public CompareCircle(double redius) {
		super(redius);
	}
	
	@Override
	public int compareTo(Object o) {
		if(this == o) {
			return 0;
		}
		if(o instanceof CompareCircle) {
			CompareCircle c = (CompareCircle)o;
			if(super.getRedius() == c.getRedius()) {
				return 0;
			}
			return super.getRedius() > c.getRedius() ? 1 : -1;
		}
		throw new RuntimeException("传入的数据类型不匹配");
		
	}
	
}
