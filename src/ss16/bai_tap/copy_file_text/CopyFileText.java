package ss16.bai_tap.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            File copyFile = new File("src/ss16/bai_tap/copy_file_text/source.txt");
            FileReader readerCopy = new FileReader(copyFile);
            BufferedReader bfreaderCopy = new BufferedReader(readerCopy);
            File pasteFile = new File("src/ss16/bai_tap/copy_file_text/target.txt");
            FileWriter fileWriter = new FileWriter(pasteFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            while ((line = bfreaderCopy.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bfreaderCopy.close();
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
