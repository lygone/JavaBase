import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by panyi on 2018/2/2.
 */
public class Thread3 implements Callable {

    public Object call() throws Exception {
        System.out.println("call方法执行了");
        return null;
    }

    public static void main(String[] args) {
        Thread3 t=new Thread3();
        FutureTask ft=new FutureTask(t);
        Thread thread =new Thread(ft);
        thread.start();
    }
}
