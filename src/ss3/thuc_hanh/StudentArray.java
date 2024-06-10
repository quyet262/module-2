package ss3.thuc_hanh;


import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String [] students = {"Quyet", "Nguyen", "Cong", "Hieu", "Hao"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học sinh ần kiểm tra: ");
        String ten  = sc.nextLine();
        boolean kiemTra = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(ten)) {
                System.out.println("Tên bạn tìm nằm ở vị trí " + i + " trong danh sách ");
                kiemTra = true;
                break;
            }
        }
        if (!kiemTra) {
            System.out.print("Tên bạn tìm không có trong danh sách");
        }
    }
}
