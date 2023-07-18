package Thread.Exer.SecurityOfThread;

/**
 * 使用同步机制将单例模式中的懒汉式改写成线程安全的
 *
 */

public class ThreadSafetyOfSingleton {
    public static void main(String[] args) {

    }
}

class Bank{

    private static Bank instance = null;

    private Bank(){

    }

    //同步方法的方式
//    public static synchronized Bank getInstance(){
//        if (instance == null){
//            instance = new Bank();
//        }
//        return instance;
//    }

    //同步代码块的方式
    //方式一：
//    public static Bank getInstance(){
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
//    }

    //方式二：双重校验锁
    public static Bank getInstance(){
        if(instance == null){
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}