package Thread.Exer.SecurityOfThread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个 账户存3000元，每次存1000，存3次。每次存玩打印账户余额
 *
 *   分析：
 *   1.是否是多线程问题？是，两个储户
 *   2.是否有共享数据？有，庄户共享
 *   3.是否有线程安全问题？？有
 *   4.需要考虑线程安全问题？同步机制：有三种方式
 *
 *
 */

class Account{
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    //存钱
    public void deposit(double balance){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.balance += balance;
        System.out.println(Thread.currentThread().getName() + ":Deposit success");
        System.out.println(Thread.currentThread().getName() + ":You have " + this.balance + " dollar now");
        System.out.println();
    }

    //取款
//    public void withdraw(double balance){
//        if(this.balance >= balance){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//            this.balance -= balance;
//            System.out.println(Thread.currentThread().getName() + ":withdrawal success");
//            System.out.println(Thread.currentThread().getName() + ":You have " + this.balance + " dollar now");
//            System.out.println();
//        }
//        System.out.println(Thread.currentThread().getName() + ":you don't have enough balance!");
//        System.out.println(Thread.currentThread().getName() + ":You have " + this.balance + " dollar now");
//        System.out.println();
//    }
}

class Customer extends Thread{
    private Account acct;
    ReentrantLock lock = new ReentrantLock();

    public Customer (Account acct){
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            goDeposit(1000);

        }
    }

    private /*static synchronized*/ void goDeposit(double money){
        //安全性加锁
        //方式一：错误，不合理！因为账户不应该是静态的，而应该是依附于客户的实例对象
//        acct.deposit(money);

        //方式二：
//        synchronized (Customer.class) {
//            acct.deposit(money);
//        }

        //方式三：也不太合适，原因同上
//        try {
//            lock.lock();
//            acct.deposit(money);
//        } finally {
//            lock.unlock();
//        }

    }
}

public class BankOfThread {
    public static void main(String[] args) {
        Account a = new Account(0);

        Customer c1 = new Customer(a);
        Customer c2 = new Customer(a);

        c1.setName("Husband");
        c2.setName("Wife");

        c1.start();
        c2.start();

    }
}
