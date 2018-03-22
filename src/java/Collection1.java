import java.util.*;

/**
 * Created by panyi on 2018/2/1.
 */
public class Collection1 {
    public static void main(String[] args) {
        HashMap h1=new HashMap();
        h1.put(1,"lygone");
        h1.put(2,"hjw");
        h1.put(3,"潘以晨");
        h1.put(4,"侯建文");
        Set s1=  h1.entrySet();
        Iterator it=s1.iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> map= (Map.Entry<Integer, String>) it.next();
            System.out.println(map.getKey()+" = "+map.getValue());
        }
    }
}
