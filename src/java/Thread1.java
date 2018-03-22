/**
 * Created by panyi on 2018/2/2.
 */
public class Thread1 extends Thread {
    public void run(){
        System.out.println("This Thread is running"+currentThread());
    }

    public static void main(String[] args) {
        Thread t1=new Thread1();
        Thread t2=new Thread1();
        t2.start();
        t1.start();

    }
}
