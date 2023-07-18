package Thread.Know.CreateThreadWay3_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三：实现Callable接口 ---> JDK5.0新增
 * 1.创建一个实现Callable接口的实现类
 * 2.实现Callable的call()，将要实现的操作声明在Call()
 * 3.创建Callable接口实现类的对象
 * 4.将此Callable实现类的对象作为参数传递到FutureTask构造器中，去创建FutureTask的对象             (相较于Runnable多出来的一步)
 * 5.将FutureTask类的对象作为参数传递到传递到Thread类的构造器中，创建Thread对象，并调用start()
 * 6.可以获取Callable中的call()的返回值
 *
 *
 * 如何理解实现Callable接口比实现Runnable接口创建多线程的方式更强大？
 * 1.call()可以有返回值
 * 2.call()可以抛出异常，被外面的操作捕获，获取异常的信息
 * 3.Callable是支持泛型的
 *
 */

//1.创建一个实现Callable接口的实现类
class NumThread implements Callable{

    //2.实现Callable的call()，将要实现的操作声明在call()
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class ImplementCallableTest {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread n = new NumThread();

        //4.将此Callable实现类的对象作为参数传递到FutureTask构造器中，去创建FutureTask的对象
        FutureTask ft = new FutureTask(n);

        //5.将FutureTask类的对象作为参数传递到传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(ft).start();

        try {
            //6.可以获取Callable中的call()的返回值
            //get()返回值即为FutureTask构造器参数 Callable实现类重写的call()的返回值。
            Object sum = ft.get();
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}
