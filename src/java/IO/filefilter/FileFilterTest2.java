package IO.filefilter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by panyi on 2018/2/24.
 */
public class FileFilterTest2 implements FilenameFilter {
 private String type;

    public FileFilterTest2(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        FileFilterTest2 fileFilterTest2=new FileFilterTest2(".mp4");
        File file=new File("e:"+File.separator+"迅雷下载");
        File[] files=file.listFiles(fileFilterTest2);
        for (File f:files) {
            if (f.isHidden()) continue;
                System.out.println(f.getAbsolutePath());

        }
    }

    @Override
    public boolean accept(File dir, String name) {
        if (name.endsWith(type)) {
            return true;
        } else {
            return false;
        }
    }
}
