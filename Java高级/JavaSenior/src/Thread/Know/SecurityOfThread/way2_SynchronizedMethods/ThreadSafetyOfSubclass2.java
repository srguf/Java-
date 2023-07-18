package Thread.Know.SecurityOfThread.way2_SynchronizedMethods;

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 *
 */

class Window2 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            show();
        }
    }

    //private synchronized void show(){  //同步监视器：t1,t2,t3
    private static synchronized void show(){  //同步监视器：Window2.class
        if (ticket > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ":" + ticket);
            ticket--;
        }
    }
}

public class ThreadSafetyOfSubclass2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();

        w1.setName("Window1");
        w2.setName("Window2");
        w3.setName("Window3");

        w1.start();
        w2.start();
        w3.start();

    }
}
