package IO.bufferedreaderandwriter;

import java.io.*;

/**
 * Created by panyi on 2018/2/26.
 */
public class BufferedWriterAndReaderTest {
    private static Reader reader=null;
    private static BufferedReader bufferedReader=null;
    private static Writer writer=null;
    private static BufferedWriter bufferedWriter=null;

    public static void main(String[] args) {
        String filepath1="D:\\IOtest.txt";
        String filepath2="D:\\456.txt";
        File file1=new File(filepath1);
        File file2=new File(filepath2);
        try{
            reader=new FileReader(file1);
            bufferedReader=new BufferedReader(reader);
            writer=new FileWriter(file2);
            bufferedWriter=new BufferedWriter(writer);
            String result=null;
            while ((result=bufferedReader.readLine())!=null){
                System.out.println(result);
                bufferedWriter.write(result);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
