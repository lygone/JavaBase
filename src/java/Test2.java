/**
 * Created by panyi on 2018/1/17.
 */
public class Test2 {
    static boolean foo(char c){
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i=0;
        for(foo('A');foo('B')&&(i<2);foo('C'))
        {
            i++;
            foo('D');
        }
        System.out.println(2<<3);
    }
}
