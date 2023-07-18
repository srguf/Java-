package Thread.Know.SecurityOfThread.way2_SynchronizedMethods;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 *
 *
 * 关于同步方法的总结：
 * 1.同步方法仍然涉及到同步监视器，只是不需要我们显式的声明
 * 2.非静态的同步方法，同步监视器：this
 *   对于静态的同步方法，同步监视器是：当前类.class  (当前类本身)
 *
 */

class Tickets2 implements Runnable{
    private int ticket = 100;

    @Override
    public /*synchronized  这里属于包多了... */ void run() {
        for (int i = 0; i <100; i++) {
            show();
        }
    }

    private synchronized void show(){  //同步监视器：this
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

public class ThreadSafetyOfRunnable2 {
    public static void main(String[] args) {
        Tickets2 t = new Tickets2();

        Thread w1 = new Thread(t);
        Thread w2 = new Thread(t);
        Thread w3 = new Thread(t);

        w1.setName("Window1");
        w2.setName("Window2");
        w3.setName("Window3");

        w1.start();
        w2.start();
        w3.start();
    }
}
