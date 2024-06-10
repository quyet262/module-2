package ss3.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int[] array;
        do {
            System.out.print("Nhập số lượng sinh viên (ít hơn 30 người): ");
            n = in.nextInt();
            array = new int[n];
        }while(n>30);
        System.out.println("Nhập điểm của từng sinh viên: ");
        for (int i = 0; i < n; i++) {
           do {
               System.out.println("sinh viên: " + i + ": ");
               array[i] = in.nextInt();
           }while(array[i] > 10);
        }
        System.out.println("Danh sách điểm của sinh viên: " + Arrays.toString(array));
        System.out.print("Số sinh viên đã đỗ là: " + sinhVienDo(array));
    }
    public static int sinhVienDo(int[] array) {
        int dem = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 ) {
                dem++;
            }
        }
        return dem;
    }
}
