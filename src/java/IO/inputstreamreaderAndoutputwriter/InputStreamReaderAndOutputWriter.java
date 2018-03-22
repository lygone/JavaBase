package IO.inputstreamreaderAndoutputwriter;

import java.io.*;

/**
 * Created by panyi on 2018/2/26.
 */
public class InputStreamReaderAndOutputWriter {
    public static void main(String[] args) {
        String filepath1="D:\\IOtest.txt";
        String filepath2="D:\\123.txt";
        File file1=new File(filepath1);
        File file2=new File(filepath2);
        InputStream inputStream=null;
        InputStreamReader inputStreamReader=null;
        OutputStream outputStream=null;
        OutputStreamWriter outputStreamWriter=null;
        try {
            inputStream = new FileInputStream(file1);
            inputStreamReader=new InputStreamReader(inputStream);
            outputStream=new FileOutputStream(file2);
            outputStreamWriter=new OutputStreamWriter(outputStream);
            int result=0;
            while((result=inputStreamReader.read())!=-1){
                outputStreamWriter.write(result);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                outputStreamWriter.flush();
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
