package Thread.Know.ThreadCommunication;

/**
 * 线程通信的例子：使用两个线程打印1-100.线程一，线程二交替打印
 *
 * 涉及到三个方法：
 * wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 * notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就唤醒优先级高的那个
 * notifyAll():一旦执行此线程，就会唤醒所有beiwait的一个线程
 *
 *
 * 说明：
 * 1.wait()、notify()、notifyAll() 三个方法必须使用在同步代码块或同步方法中
 * 2.wait()、notify()、notifyAll() 三个方法的调用者必须是同步代码块或同步方法中的同步监视器
 *      否则，会出现异常IllegalMonitorStateException异常
 * 3.wait()、notify()、notifyAll() 三个方法是定义在java.lang.Object类中的
 *
 *
 * 面试题：sleep()和wait()的异同
 *       相同点：一旦执行方法，都可以使当前的线程进入阻塞状态
 *       不同点：1)两个方法声明的位置不同：Thread类中声明sleep(),Object类中声明wait()。
 *             2)调用的范围不同。sleep()可以在任何场景下使用，而wait()只能在同步代码块或同步方法中调用
 *             3)关于是否释放同步监视器：sleep()不会释放同步监视器，而wait()会释放同步监视器
 */

class Number implements Runnable{
    private int number = 1;
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj) {

                obj.notify();

                if(this.number <= 100){
                    System.out.println(Thread.currentThread().getName() + ":" + this.number);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    number++;

                    try {
                        obj.wait();  //this. 被省略
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number n = new Number();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(n);

        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.start();
        t2.start();
    }
}
