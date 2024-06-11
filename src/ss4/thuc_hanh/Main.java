package ss4.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rong: ");
        double a = sc.nextDouble();
        System.out.println("Nhập chiều dài: ");
        double b = sc.nextDouble();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(a, b);
        System.out.println("Hình chữ nhật của bạn tạo \n" + hinhChuNhat.hienThi());
        System.out.println("Diện tích " + hinhChuNhat.getDienTich());
        System.out.println("Chu vi: " + hinhChuNhat.getChuVi());
    }
}
