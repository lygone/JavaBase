/**
 * Created by panyi on 2018/3/20.
 */
public class SingletonTest {
    private SingletonTest(){}
    private static SingletonTest singletonTest=new SingletonTest();
    public static SingletonTest getInstance(){
        return singletonTest;
    }

    public static void main(String[] args) {
        SingletonTest s1=SingletonTest.getInstance();
        SingletonTest s2=SingletonTest.getInstance();
        SingletonTest s3=new SingletonTest();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
