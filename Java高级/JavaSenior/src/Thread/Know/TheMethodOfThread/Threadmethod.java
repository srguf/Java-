package Thread.Know.TheMethodOfThread;

/**
 * 测试Thread中的常用方法
 * 1.start():启动当前线程；调用当前线程run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():释放当前cpu的执行权    yield:出产;让步
 * 7.join():在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b完全执行完成后，线程a才结束阻塞状态
 * 8.stop():已过时。当执行此方法时，强制结束当前线程
 * 9.sleep(long millitime):让当前线程"睡眠"指定的millitime     (单位：毫秒)
 * 10.isAlive():判断当前线程是否还存活
 *
 *
 * 线程的优先级
 * 1. MAX_PRIORITY: 10
 *    MIN_PRIORITY: 1
 *    NORM_PRIORITY: 5  -->默认优先级
 * 2.如何获取和设置当前线程的优先级
 *   getPriority():获取线程的优先级
 *   setPriority(int p):设置线程的优先级
 *
 * 说明：高优先级的线程要抢占低优先级线程cpu的执行权。但是只是从概率上讲。
 *      高优先级的线程只是高概率被先执行。并不意味着只有当高优先级被执行后，低优先级才会执行
 */

public class Threadmethod extends Thread {

    public Threadmethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //              System.out.println(Thread.currentThread().getName() + ":" + i);
                System.out.println(getName() + ": " + Thread.currentThread().getPriority() + ": " + i);
            }


            if (i % 20 == 0) {
                this.yield();
                ;
            }
        }

    }
}



