package Thread.Exer.CommunicationOfThread;

/**
 * 线程通信的应用：
 *    经典例题：生产、消费者问题
 *
 * 生产者(producer)将产品交给店员(Clerk)，而消费者(Customer)从电源处取走产品，店员一次只能持有固定数量的产品(比如：20)，
 * 如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；
 * 如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品
 *
 *
 * 分析：
 * 1.是否是多线程问题？ 是，生产者线程，消费者线程
 * 2.是否有共享数据？  是，店员(或产品)
 * 3.如何来解决线程的安全问题？  同步机制，三种方法
 * 4.是否涉及到线程的通信
 *
 */

class Clerk{
    private int product = 0;

    public int getProduct() {
        return product;
    }
    public void setProduct(int product) {
        this.product = product;
    }
}



class Producer implements Runnable{
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    public void produceProduct(){
        clerk.setProduct(clerk.getProduct() + 1);
    }

    @Override
    public void run() {
        System.out.println("Products are produced begin");

        while (true){
            synchronized (clerk) {

                if(clerk.getProduct() < 20){

                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    produceProduct();
                    System.out.println(Thread.currentThread().getName() +
                            ": produce one,and residue " + clerk.getProduct());

                    clerk.notifyAll();

                } else {
                    try {
                        clerk.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }

    }
}


class Customer implements Runnable{
    private Clerk clerk;

    public Customer(Clerk clerk){
        this.clerk = clerk;
    }

    public void consumeProduct(){
        clerk.setProduct(clerk.getProduct() - 1);
    }

    @Override
    public synchronized void run() {
        System.out.println("Products are consumed begin");

        while (true){
            synchronized (clerk) {

                if(clerk.getProduct() > 0){

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    consumeProduct();
                    System.out.println(Thread.currentThread().getName() +
                            ": consume one,and residue " + clerk.getProduct());

                    clerk.notify();

                } else {
                    try {
                        clerk.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }

    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p = new Producer(clerk);
        Customer c1 = new Customer(clerk);
        Customer c2 = new Customer(clerk);

        Thread t1 = new Thread(p);
        t1.setName("Producer");

        Thread t2 = new Thread(c1);
        t2.setName("Customer1");
        Thread t3 = new Thread(c2);
        t3.setName("Customer2");

        t1.start();
        t2.start();
        t3.start();
    }
}
