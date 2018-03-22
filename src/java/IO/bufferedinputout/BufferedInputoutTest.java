package IO.bufferedinputout;

import java.io.*;

/**
 * Created by panyi on 2018/2/24.
 */
public class BufferedInputoutTest {
    public static void main(String[] args) throws IOException {
        String filePath = "E:/侄女.jpg" ;
        String filePath2 = "E:/123.jpg" ;
        File file = new File( filePath ) ;
        File file2 = new File( filePath2 ) ;
        copyFile( file , file2 );
    }
    private static void copyFile(File oldFile,File newFile) throws IOException{
        InputStream inputStream=null;
        BufferedInputStream bufferedInputStream=null;
        OutputStream outputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        inputStream=new FileInputStream(oldFile);
        bufferedInputStream=new BufferedInputStream(inputStream);
        outputStream=new FileOutputStream(newFile);
        bufferedOutputStream=new BufferedOutputStream(outputStream);
         int len=0;
        byte[] b=new byte[1024];

        while ((len=bufferedInputStream.read(b))!=-1){
            bufferedOutputStream.write(b,0,len);
        }
        bufferedOutputStream.flush();
    }
}
