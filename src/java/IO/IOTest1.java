package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by panyi on 2018/2/24.
 */
public class IOTest1 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileReader fileReader=new FileReader("D:\\IOtest.txt");
        properties.load(fileReader);
        properties.setProperty("score","100");
        FileWriter fileWriter=new FileWriter("D:\\IOtest.txt");
        properties.store(fileWriter,"");
        fileWriter.close();
        fileReader.close();
    }
}
