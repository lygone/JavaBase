import java.lang.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by panyi on 2018/2/5.
 */
public class VectorTest {
    private String username;
    private int age;
    private String sex;

    public VectorTest(String username, int age, String sex) {
        this.username = username;
        this.age = age;
        this.sex = sex;
    }

    @java.lang.Override
    public String toString() {
        return "VectorTest{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        VectorTest v1=new VectorTest("潘以晨",23,"男");
        VectorTest v2=new VectorTest("侯建文",22,"男");
        VectorTest v3=new VectorTest("杨金磊",23,"男");
        VectorTest v4=new VectorTest("吉松松",24,"男");
        Vector v=new Vector();
        v.add(v1);
        v.add(v2);
        v.add(v4);
        v.add(v3);
        Enumeration eu=v.elements();
        while(eu.hasMoreElements()){
            System.out.println(eu.nextElement());
        }
    }
}
