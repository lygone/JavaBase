/**
 * Created by panyi on 2018/2/2.
 */
public class Thread2 implements Runnable {

    public void run() {
        System.out.println("This thread is running");
    }

    public static void main(String[] args) {
        Thread2 t=new Thread2();
        Thread thread=new Thread(t);
        thread.start();
    }
}
