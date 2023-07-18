package Thread.Know.SecurityOfThread.way3_ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：Lock锁 --- JDK5.0新增
 * 1.实例化
 * 2.try{}finally{}中调用锁lock()
 * 3.调用解锁方法：unlock
 *
 * 注意：
 * lock锁和synchronized方法锁一样，依附于当前的实例
 *
 *
 * 1.面试题：synchronized 与 lock 的异同？
 *   相同：都可以解决线程的安全问题
 *   不同：synchronized机制在执行完相应的同步代码块后，自动释放同步监视
 *        lock需要手动的启动同步 (lock())，同时结束同步也需要手动实现 (unlock())
 *
 * 2.如何解决线程的安全问题？有几种方式？
 *
 */

class Tickets implements Runnable{
    private int ticket = 100;
    //1.实例化
    private ReentrantLock lock = new ReentrantLock(true);  //true代表公平锁

    @Override
    public void run() {
        while (true){

            try {

                //2.调用锁lock()
                lock.lock();
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
            } finally {
                //3.调用解锁方法：unlock
                lock.unlock();
            }

        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Tickets t = new Tickets();

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
