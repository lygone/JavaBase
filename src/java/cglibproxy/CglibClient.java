package cglibproxy;

/**
 * Created by panyi on 2018/2/10.
 */
public class CglibClient {
    public static void main(String[] args) {
        CglibDynamicProxy cglib = new CglibDynamicProxy();
        CglibRealSubject realSubject = (CglibRealSubject) cglib.getProxyInstance(new CglibRealSubject());
        realSubject.visit();
    }
}
