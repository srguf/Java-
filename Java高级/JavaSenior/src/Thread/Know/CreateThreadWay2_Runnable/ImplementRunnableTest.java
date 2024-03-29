package Thread.Know.CreateThreadWay2_Runnable;

/**
 * 创建多线程的方式二：实现Runable接口
 * 1.创建了一个实现Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法:run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 * 比较创建线程的两种方式
 * 开发中，优先选择：实现Runnable接口的方式
 * 原因：1.实现的方式没有类的单继承性的局限性
 *      2.实现的方式天然的适合处理多个线程有共享数据的情况
 *
 * 两种方法之间的联系：
 *     public class Thread implements Runnable
 * 相同点：两种方式都需要重写run()，将线程要 执行的逻辑声明在run()中
 *        目前两种方式，要想启动线程，都必须调用Thread类中的start()
 *
 *
 *  补充：线程的分类：
 *       一种是用户线程，一种是守护线程
 */

//1.创建了一个实现Runnable接口的类
class MyThread implements Runnable{

    //2.实现类去实现Runnable中的抽象方法:run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ImplementRunnableTest {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MyThread t = new MyThread();
        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(t);
        t1.setName("Thread1");
        //5.通过Thread类的对象调用start(): ①启动线程 ②调用当前线程的run() -->调用了Runnable类型的target
        t1.start();

        //再启动一个线程，遍历100以内的偶数
        Thread t2 = new Thread(t);
        t2.setName("Thread2");
        t2.start();
    }
}
