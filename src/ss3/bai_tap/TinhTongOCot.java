package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongOCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] array;
        System.out.println("Nhập số hàng của mảng: ");
        int n = sc.nextInt();
        array = new double[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số Phần tử trong hàng: " + i);
            int m = sc.nextInt();
            array[i] = new double[m];
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập giá trị ở vị trí " + i + " " + j + " của mảng: ");
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.deepToString(array));
        System.out.print("Tổng hàng bạn chọn là: " + tongCot(array));
    }

    public static double tongCot(double[][] arr) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Bạn muốn tính tổng hàng nào? ");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == n) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
