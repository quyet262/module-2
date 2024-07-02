package module2.traffic_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFromFile(String pathFile) throws IOException {
        List<String> stringList = new ArrayList();
        File file = new File(pathFile);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    stringList.add(line);
                }
            }
        }
        return stringList;
    }
    public static  void writeListStringToFile(String pathFile,List<String> stringList,boolean append) throws IOException {
        File file = new File(pathFile);
        if (file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,append))) {
                for (String string : stringList) {
                    bw.write(string);
                    bw.newLine();
                }
            }
        }
    }

}
