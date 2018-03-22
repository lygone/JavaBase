package IO.fileinputout;

import java.io.*;
import java.io.FileOutputStream;

/**
 * Created by panyi on 2018/2/24.
 */
public class CopyFile {
    public static void main(String[] args) throws IOException{
        String path="D:\\IOtest.txt";
        FileInputStream fileInputStream=new FileInputStream(path);
        int len=fileInputStream.available();
        byte[] bytes=new byte[len];
        System.out.println(fileInputStream.read(bytes));
        FileOutputStream fileOutputStream=new FileOutputStream("E:\\IOtest.txt");
        fileOutputStream.write(bytes);
        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }
}
