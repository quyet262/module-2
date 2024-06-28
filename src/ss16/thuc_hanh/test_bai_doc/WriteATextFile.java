package ss16.thuc_hanh.test_bai_doc;

import java.io.FileWriter;
import java.io.IOException;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Ngày mai sẽ khác");
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
