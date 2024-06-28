package ss16.thuc_hanh.test_bai_doc;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("foo.txt");f.mkdir();
        File dir = new File("Books");dir.mkdir();
        if(dir.isDirectory()){
            String[] dirContents = dir.list();
            for(int i = 0; i < dirContents.length; i++)
                System.out.println(dirContents[i]);
        }
        System.out.println(dir.getAbsolutePath());
        boolean isDelete = f.delete();
    }
}
