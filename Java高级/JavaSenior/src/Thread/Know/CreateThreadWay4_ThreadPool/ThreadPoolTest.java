package Thread.Know.CreateThreadWay4_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建线程的方式四：使用线程池
 * 1.提供指定数量的线程池
 * 2.执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
 * 3.关闭连接池
 *
 * 好处：
 * 1.提高响应速度(减少了创建新线程的时间)
 * 2.降低资源消耗(重复利用线程池中的线程，不需要每次都创建)
 * 3.便于线程管理
 *      corePoolSize:核心池的大小
 *      maximumPoolSize:最大的线程数
 *      keepAliveTime:线程没有任务是最多保持多长时间后会终止
 *
 * 注意：
 * ExecutorService接口：真正的线程池接口     executor:遗嘱执行人
 * 线程池对象.execute():适合使用Callable    execute:将···处死；执行
 * 线程池对象.submit():适合使用Callable     submit:提交，呈递
 *
 * 面试题：创建多线程有几种方式？   四种！
 *
 */

class NumberThread implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+ ":" + i);
            }
        }
    }
}

class NumberThread1 implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName()+ ":" + i);
            }
        }
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) {
        //1.提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;

        //设置线程池的属性
//        System.out.println(service.getClass());
//        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();

        //2.执行指定的线程的操作。需要提供实现Runnable接口或Callab接口实现类的对象
        service.execute(new NumberThread());//适合于Runnable
        service.execute(new NumberThread1());//适合于Runnable
//        service.submit(Callable callable);   //适合使用Callable

        //3.关闭连接池
        service.shutdown();

    }
}
