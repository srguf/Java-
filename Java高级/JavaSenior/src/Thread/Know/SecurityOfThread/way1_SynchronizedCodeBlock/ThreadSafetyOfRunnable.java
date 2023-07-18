package Thread.Know.SecurityOfThread.way1_SynchronizedCodeBlock;

/**
 * 例子：创建三个窗口卖票，总票数为100张。使用实现Runnable接口 的方式实现
 *
 * 1.问题：买票过程中，出现了重票、错票    --> 出现了线程的安全问题
 *
 * 2.问题出现的原因：当某个 线程操作车票的过程中，尚未完成操作时，其他线程参与进来，也操作车票
 *
 * 3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程a操作完成ticket时，其他线程才可以操作ticket。
 *           这种情况即使线程a出现了阻塞，也不能被改变。
 *
 * 4.在Java中，我们通过同步机制，来解决线程的安全问题。
 *    方式一：同步代码块
 *         synchronized(同步监视器){
 *            //需要被同步的代码
 *         }
 *    说明：1.操作共享数据的代码，即为需要被同步的代码     --> 不能包含代码多了，也不能包含代码少了
 *           共享数据：多个线程共同操作的变量。比如：ticket就是共享数据
 *         2.同步监视器，俗称：锁。(任何一个类的对象，都可以充当锁)
 *           要求：多个线程必须要共用一把锁
 *    补充：在实现Runnable接口的方式中，我们可以考虑使用this充当同步监视器
 *         而在继承Thread类实现的方式中，慎用this，可以考虑使用当前类充当同步监视器(类名.class)
 *
 *    方式二：同步方法
 *
 *
 * 5.同步的方式，解决了线程的安全问题。   --> 优点
 *   操作同步代码时，只能有一个线程参与，其他代码等待    -->不足
 *
 */

class Tickets implements Runnable{
    private int ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true){
                //以下注释部分不满足只有一个锁的条件
            synchronized (this){ //此时的this就代表了唯一的Tickets对象
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

public class ThreadSafetyOfRunnable {
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
