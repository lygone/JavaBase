/**
 * Created by panyi on 2018/2/5.
 */
public class Override {
    public void show(){
        System.out.println("主方法");
    }
    public static void main(String[] args) {
        Override ov=new Override();
        ov.show();
    }
}
 class Override1 extends Override{
    public void show(){
        System.out.println("覆盖方法");
    }
}
