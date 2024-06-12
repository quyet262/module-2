package ss4.bai_tap.bai_tap_ve_nha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên tối đa: ");
        int maxSinhVien = scanner.nextInt();
        scanner.nextLine();  // Đọc bỏ dòng mới

        QuanLySinhVien qlsv = new QuanLySinhVien(maxSinhVien);

        while (true) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã SV: ");
                    int maSV = scanner.nextInt();
                    scanner.nextLine();  // Đọc bỏ dòng mới
                    System.out.print("Nhập tên: ");
                    String tenSv = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String sdt = scanner.nextLine();
                    System.out.print("Nhập GPA: ");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();  // Đọc bỏ dòng mới
                    SinhVien sv = new SinhVien(maSV, tenSv, email, sdt, gpa);
                    qlsv.themSinhVien(sv);
                    break;
                case 2:
                    System.out.print("Nhập mã SV của sinh viên cần sửa: ");
                    int maSVSua = scanner.nextInt();
                    scanner.nextLine();  // Đọc bỏ dòng mới
                    System.out.print("Nhập tên mới: ");
                    String newTenSv = scanner.nextLine();
                    System.out.print("Nhập email mới: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Nhập số điện thoại mới: ");
                    String newSdt = scanner.nextLine();
                    System.out.print("Nhập GPA mới: ");
                    double newGpa = scanner.nextDouble();
                    scanner.nextLine();  // Đọc bỏ dòng mới
                    qlsv.suaSinhVien(maSVSua, newTenSv, newEmail, newSdt, newGpa);
                    break;
                case 3:
                    System.out.print("Nhập mã SV của sinh viên cần xóa: ");
                    int maSVXoa = scanner.nextInt();
                    scanner.nextLine();  // Đọc bỏ dòng mới
                    qlsv.xoaSinhVien(maSVXoa);
                    break;
                case 4:
                    qlsv.hienThiSinhVien();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
