package IO.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by panyi on 2018/2/24.
 */
public class FileTest2 {
    public static void main(String[] args)throws IOException {
        File file = new File("d:" + File.separator);
        getFile(file);

    }

    private static void getFile(File file) {
        File[] files = file.listFiles() ;
        for( File f : files ){
            if ( f.isHidden() ) continue ;

            if(f.isDirectory() ){
                getFile( f );
            }else{
                System.out.println( f.getAbsolutePath()  + "  " + f.getName() );
            }
        }
    }
}
