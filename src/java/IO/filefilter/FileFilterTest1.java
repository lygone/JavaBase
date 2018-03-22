package IO.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Created by panyi on 2018/2/24.
 */
public class FileFilterTest1 implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException{
        File file=new File("d:"+File.separator);
        FileFilterTest1 fileFilterTest1=new FileFilterTest1();
        File[] files=file.listFiles(fileFilterTest1);
        for (File f:files){
            if (f.isHidden()) continue;
            System.out.println(f.getAbsolutePath());
        }
    }

}
