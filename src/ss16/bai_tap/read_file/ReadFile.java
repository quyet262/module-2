package ss16.bai_tap.read_file;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            boolean run = true;
            while (run) {
                File readCSV = new File("src/ss16/bai_tap/read_file/country.csv");
                System.out.println("1.Thêm quốc gia mới: ");
                System.out.println("2.Hiển thị danh sách quốc gia: ");
                System.out.println("0.Exit: ");
                System.out.println("Nhập lựa chọn của bạn: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        FileWriter writerCSV = new FileWriter(readCSV,true);
                        BufferedWriter bufferedWriterCSV = new BufferedWriter(writerCSV);
                        System.out.println("Nhập id: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập mã quốc gia: ");
                        String code = scanner.nextLine();
                        System.out.println("Nhập tên quốc gia: ");
                        String name = scanner.nextLine();
                        Country country = new Country(id, code, name);
                        bufferedWriterCSV.write(country.getId() + "\t" + country.getCode() + "\t" + country.getName());
                        bufferedWriterCSV.newLine();
                        bufferedWriterCSV.close();
                        break;
                    case 2:
                        FileReader fileReaderCSV = new FileReader(readCSV);
                        BufferedReader bufferedReaderCSV = new BufferedReader(fileReaderCSV);
                        String line = "";
                        while ((line = bufferedReaderCSV.readLine()) != null) {
                            String [] data = line.split("\t");
                            int idShow = Integer.parseInt(data[0]);
                            String codeShow = data[1];
                            String nameShow = data[2];
                            Country countryShow = new Country(idShow, codeShow, nameShow);
                            System.out.println(countryShow);
                        }
                        bufferedReaderCSV.close();
                        break;
                        case 0:
                            run = false;
                            scanner.close();
                            System.exit(0);
                            break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
