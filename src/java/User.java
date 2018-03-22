import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Created by panyi on 2018/2/2.
 */
public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        User u1=new User("lygone",23);
        User u2=new User("hjw",22);
        User u3=new User("jss",25);
        User u4=new User("yjl",24);
        TreeMap<User,Integer> t1=new TreeMap<User,Integer>(new Comparator<User>() {

            public int compare(User o1, User o2) {
               if(o1.getAge()<o2.getAge()){
                   return -1;
               }else if(o1.getAge()>o2.getAge()){
                   return 1;
               }else{
                   return o1.getName().compareTo(o2.getName());
               }
            }
        });
        t1.put(u1,40);
        t1.put(u2,19);
        t1.put(u3,22);
        t1.put(u4,20);
        Iterator<User> it=t1.keySet().iterator();
        while(it.hasNext()){
            User key=it.next();
            System.out.println("key="+key+" ,value="+t1.get(key));
        }
    }



}
