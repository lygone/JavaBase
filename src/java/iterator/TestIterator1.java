package iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by panyi on 2018/3/17.
 */
public class TestIterator1 {
    public static void main(String[] args) {
        List<String> list=new CopyOnWriteArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
       for(Iterator<String> it=list.iterator();it.hasNext();){
           String str=it.next();
           if (str.equals("second")){
               list.add("five");}
           System.out.println(str);
       }
     }
}
