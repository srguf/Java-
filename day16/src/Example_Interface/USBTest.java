package Example_Interface;

/*
 * 接口的使用
 * 1.接口使用上也满足多态性
 * 2.接口，实际上是定义了一种规范
 * 3.开发中，体会面向接口编程
 * 
 */

public class USBTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		//1.创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		computer.transferData(flash);
		System.out.println("*****************");
		
		
		//2.创建了接口的非匿名实现类的匿名对象
		computer.transferData(new Flash());
		System.out.println("*****************");
		
		//3.创建了接口的匿名实现类的非匿名对象
		USB f = new Flash() {};
		USB phone = new USB() {
			@Override
			public void start() {
				System.out.println("手机开始工作");
			}
			@Override
			public void stop() {
				System.out.println("手机结束工作");
			}
		};
		computer.transferData(f);
		System.out.println();
		computer.transferData(phone);
		System.out.println("*****************");
		
		//4.创建了接口的匿名实现类的匿名对象
		computer.transferData(new USB() {
			@Override
			public void start() {
				System.out.println("匿名类匿名对象开始");
			}
			@Override
			public void stop() {
				System.out.println("匿名类匿名对象结束");
			}
		});
		
	}
}

class Computer{
	
	public void transferData(USB usb) {//USB usb = new Flash();
		usb.start();
		System.out.println("实现的细节");
		usb.stop();
		
	}
}

interface USB{
	//常量，定义了长，宽，最大最小传输速度等
	
	void start();
	void stop();
	
}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开启工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘结束工作");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("打印机开始工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
	}
	
}



