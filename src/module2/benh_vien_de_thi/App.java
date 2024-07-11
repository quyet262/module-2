package module2.benh_vien_de_thi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MedicalRecordSystem system = new MedicalRecordSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Thêm mới bệnh án");
            System.out.println("2. Xóa bệnh án");
            System.out.println("3. Xem danh sách bệnh án");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    system.addRecord();
                    break;
                case 2:
                    system.deleteRecord();
                    break;
                case 3:
                    system.viewRecords();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}

