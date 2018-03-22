package copyonwriteArrayist;

import java.util.List;

/**
 * Created by panyi on 2018/2/9.
 */
public class ReadThread implements Runnable {
    private List<Integer> list;
    public ReadThread(List<Integer> list){
        this.list=list;
    }
    @Override
    public void run() {
        for(Integer ele:list){
            System.out.println("ReadThread:"+ele);

        }

    }
}
