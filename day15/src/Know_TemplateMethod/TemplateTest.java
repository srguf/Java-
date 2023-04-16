package Know_TemplateMethod;

/*
 * 抽象类的应用：模板方法设计模式
 * 		整体步骤固定，通用，这些在父类中已经写好。
 * 	但某些部分易变，易变部分可以抽象出来，供不同子类实现。这就是一种模板模式
 * 
 * 
 * 小结：固定的模块在抽象父类中写好，易变的部分用抽象方法代替，
 * 		然后在创造的子类中重写(实现)易变的部分
 */

public class TemplateTest {
	
	public static void main(String[] args) {
		
		Template t = new SubTemplate();
		t.spendTime();
		System.out.println();
		
		Template t2 = new SubTemplate2();
		t2.spendTime();
	}
	
}


abstract class Template{
	
	//计算某段代码执行花费的时间
	public void spendTime() {
		long start = System.currentTimeMillis();
		
		this.code();//不确定的部分，易变的部分
		
		long end = System.currentTimeMillis();
		System.out.println("花费的时间为：" + (end - start));
	}
	
	public abstract void code();
	
}


class SubTemplate extends Template{

	@Override
	public void code() {
		
		//1000以内质数
		for(int i = 2;i <= 1000;i++) {
			boolean isFlag = true;
			
			for(int j = 2;j <= Math.sqrt(i);j++) {
				
				if(i % j == 0) {
					isFlag = false;
					break;
				}
			}
			
			if(isFlag){
				System.out.println(i);
			}
			
		}
		
	}
	
}


class SubTemplate2 extends Template{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		
		//...
		
	}
	
}
