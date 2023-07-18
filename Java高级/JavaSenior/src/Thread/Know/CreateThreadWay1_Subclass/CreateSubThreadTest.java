package Thread.Know.CreateThreadWay1_Subclass;

/**
 * 多线程的创建：方式一：继承于Thread类
 * 1.创建一个继承于Thread的子类
 * 2.重写Thread类的run()
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()
 *
 * 注意点：
 * 1.多线程必须调用start(),不可直接调用run()
 * 2.一个类的对象只可启动一个线程。
 */

//练习：创建两个线程，一个遍历奇数，一个遍历偶数
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}



public class CreateSubThreadTest {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("爷开心随便写的");
                }
            }
        }.start();;

    }

}
