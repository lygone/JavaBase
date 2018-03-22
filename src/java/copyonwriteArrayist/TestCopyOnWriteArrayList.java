package copyonwriteArrayist;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by panyi on 2018/2/9.
 */
public class TestCopyOnWriteArrayList {
    public void test(){
        List<Integer> templist= Arrays.asList(new Integer[]{1,2,3});
        CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>(templist);
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));
        executorService.execute(new ReadThread(copyList));
        executorService.execute(new WriteThread(copyList));
        System.out.println("copyList size:"+copyList.size());
    }

    public static void main(String[] args) {
        new TestCopyOnWriteArrayList().test();
    }
}
