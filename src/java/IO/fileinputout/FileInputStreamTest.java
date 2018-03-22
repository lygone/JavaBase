package IO.fileinputout;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by panyi on 2018/2/24.
 */
public class FileInputStreamTest{
    public static void main(String[] args) throws IOException{
        String filepath="d:"+ File.separator+"IOtest.txt";
        FileInputStream fileInputStream=new FileInputStream(filepath);
        int size=fileInputStream.available();
        byte[] bytes=new byte[size];
        fileInputStream.read(bytes);
        System.out.println(new String(bytes));
    }
}
