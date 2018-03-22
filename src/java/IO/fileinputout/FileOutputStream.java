package IO.fileinputout;

import java.io.IOException;

/**
 * Created by panyi on 2018/2/24.
 */
public class FileOutputStream {

    public static void main(String[] args) throws IOException {
        String filepath="D:\\IOtest.txt";
        String content = "今天是2017/1/9,天气很好" ;
        java.io.FileOutputStream fileOutputStream=new java.io.FileOutputStream(filepath);
        byte[] bytes=content.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
