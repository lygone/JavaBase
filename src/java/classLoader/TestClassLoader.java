package classLoader;

/**
 * Created by panyi on 2018/3/15.
 */
public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader cl1=TestClassLoader.class.getClassLoader();
        System.out.println(cl1);
        ClassLoader cl2=cl1.getParent();
        System.out.println(cl2);
        ClassLoader cl3=cl2.getParent();
        System.out.println(cl3);
    }
}
