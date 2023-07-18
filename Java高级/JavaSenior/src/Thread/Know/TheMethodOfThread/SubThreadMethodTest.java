package Thread.Know.TheMethodOfThread;


public class SubThreadMethodTest {
    public static void main(String[] args) {
        Threadmethod t1 = new Threadmethod("Thread1");

        //设置分线程的优先级
//      t1.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(1);

//        t1.setName("Thread one");
        t1.start();


        //给主线程命名和设置优先级
        Thread.currentThread().setName("main Thread");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getPriority() + ": " + i);
            }

            if(i % 20 == 0) {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Thread1Finish?\n" + t1.isAlive());


    }


}
