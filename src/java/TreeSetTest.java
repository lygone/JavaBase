import java.lang.*;
import java.lang.Override;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by panyi on 2018/2/7.
 */
public class TreeSetTest {
    private String name;
    private int age;

    public TreeSetTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @java.lang.Override
    public String toString() {
        return "TreeSetTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public static void main(String[] args) {
        TreeSetTest t1=new TreeSetTest("lygone",22);
        TreeSetTest t2=new TreeSetTest("hjw",24);
        TreeSetTest t3=new TreeSetTest("yjl",23);
        TreeSetTest t4=new TreeSetTest("jss",26);
        TreeSet<TreeSetTest> t=new TreeSet<TreeSetTest>(new Comparator<TreeSetTest>() {
            @Override
            public int compare(TreeSetTest o1, TreeSetTest o2) {
                if(o1.getAge()<o2.getAge()){
                    return -1;
                }else if(o1.getAge()>o2.getAge()){
                    return 1;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        t.add(t1);
        t.add(t2);
        t.add(t3);
        t.add(t4);
        Iterator it=t.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
