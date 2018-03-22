import java.util.Iterator;
import java.util.TreeMap;

/**
 * Created by panyi on 2018/2/2.
 */
public class Collection2 {
    public static void main(String[] args) {
        TreeMap t1=new TreeMap();
        t1.put(1,"lygone");
        t1.put(2,"hjw");
        t1.put(3,"yjl");
        t1.put(4,"jss");
        Iterator it= t1.keySet().iterator();
        while(it.hasNext()){
            Integer key= (Integer) it.next();
            String value= (String) t1.get(key);
            System.out.println("key="+key+" ,value="+value);
        }
    }
}
