package jdkProxy;

/**
 * Created by panyi on 2018/2/9.
 */
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String name) {
        System.out.println("hello"+" ,"+name);
    }
}
