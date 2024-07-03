package module2.vehicle_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFromFile(String pathFile) throws IOException {
        List<String> stringList = new ArrayList<>();
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

    public static void writeStringToFile(String pathFile, String data, boolean append) throws IOException {
        File file = new File(pathFile);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, append))) {
            bw.write(data);
            bw.newLine();
        }
    }

    public static void clearFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        if (file.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write("");
            }
        }
    }
}

