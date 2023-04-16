package Know_Proxy_Exer_Interface;

/*
 * 接口的应用：代理模式
 * 
 * 概述：代理模式是Java开发中使用较多的一种设计模式。
 * 		代理设计就是为其他对象提供一种代理以控制对这个对象的访问。
 * 
 * 自己的一点思考：将被代理的类实例化为代理类的一个属性，
 * 				然后在代理类中操作被代理实例
 * 		(不直接暴漏被代理类，对外暴漏代理类)
 */

public class NetWorkTest {
	public static void main(String[] args) {
//		Server server = new Server();
//		ProxyServer proxyServer = new ProxyServer(server);
		
		ProxyServer proxyServer = new ProxyServer(new Server());
		
		proxyServer.say();
		proxyServer.browse();
		
	}
}

interface NetWork{
	
	public void browse();
	
}

//被代理类
class Server implements NetWork{
	@Override
	public void browse() {
		System.out.println("Server:真实的服务器来访问网络");
	}
}

//代理类
class ProxyServer implements NetWork{
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	public void check() {
		System.out.println("Proxy:联网之前的检查工作");
	}
	
	public void say() {
		System.out.println("Proxy say:Hello!");
	}
	
	@Override
	public void browse() {
		check();
		
		work.browse();
		
	}
	
}


