package ss16.thuc_hanh.test_bai_doc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFromFile {
    public static void scannerFromFile() {
        try {
            java.io.File file = new File("scores.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + mi + " " + lastName + " " + score);
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
