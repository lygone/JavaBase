package copyonwriteArrayist;

import java.util.List;

/**
 * Created by panyi on 2018/2/9.
 */
public class WriteThread implements Runnable {
    private List<Integer> list;

    public WriteThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        this.list.add(9);
    }
}
