package IO;

import java.io.File;

/**
 * Created by panyi on 2018/3/15.
 */
public class IOTest2 {
    public static void main(String[] args) {
        File file=new File("c:"+File.separator+"testDir1");
        if(!file.exists()){
            System.out.println("目录不存在");
            return;
        }
        File[] files=file.listFiles();
        for(int i=0;i<files.length;i++){
            if(files[i].isFile()){
                System.out.println("file'name is="+files[i].getName());
            }else {
                System.out.println("the directory'name is="+files[i].getName());
            }
        }
    }
}
