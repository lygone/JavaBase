package IO.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by panyi on 2018/2/24.
 */
public class FileTest1 {
    public static void main(String[] args) throws IOException {
        String parentFilepath="d:"+ File.separator+"cat";
        String filename="cat.txt";
        File file=new File(parentFilepath);
        file.mkdir();
       File file1=new File(parentFilepath,filename);
        file1.createNewFile();
    }
}
