package ss16.thuc_hanh.test_bai_doc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DumpURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://uet.vnu.edu.vn");
            URLConnection conn = url.openConnection();
            InputStream stream = conn.getInputStream();
            InputStreamReader ir = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(ir);
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
