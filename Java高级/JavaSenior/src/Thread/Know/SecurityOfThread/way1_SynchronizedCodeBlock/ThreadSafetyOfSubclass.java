package Thread.Know.SecurityOfThread.way1_SynchronizedCodeBlock;

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 * 例子：创建三个窗口卖菜，总票数100，使用继承Thread类的方式
 *
 *
 */

class Window extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true){
            //以下注释部分不满足只有一个锁的条件
            synchronized (Window.class){ //(类是一个对象的模板，本质上也是一个对象！！！！)
            //方式二：synchronized (obj /*new Object()*/ ) {
                //Object obj = new Object();
                if (ticket > 0) {

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class ThreadSafetyOfSubclass {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("Window1");
        w2.setName("Window2");
        w3.setName("Window3");

        w1.start();
        w2.start();
        w3.start();

    }

}
