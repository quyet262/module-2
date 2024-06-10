package ss3.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double [] array;
        do {
            System.out.print("Nhập số Tỷ phú bạn muốn so sánh (không quá 20 người): ");
            n = sc.nextInt();
            array = new double[n];
        }while (n > 20);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập người thứ " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(array));
    }
}
