import java.lang.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by panyi on 2018/2/8.
 */
public class ThreadTest1 {

    public static void main(String[] args) {
        ExecutorService pool= Executors.newCachedThreadPool();
        Thread t1=new MyThread();
        Thread t2=new MyThread();
        Thread t3=new MyThread();
        Thread t4=new MyThread();
        Thread t5=new MyThread();
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        pool.shutdown();
    }
}
class MyThread extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行");
    }
}