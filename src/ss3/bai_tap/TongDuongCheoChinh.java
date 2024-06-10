package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheoChinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] array;
        System.out.println("Nhập số hàng và cột của mảng: ");
        int n = sc.nextInt();
        array = new double[n][];
        for (int i = 0; i < n; i++) {
            array[i] = new double[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập giá trị ở vị trí " + i + " " + j + " của mảng: ");
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Mảng vừa tạo là: " + Arrays.deepToString(array));
        System.out.print("Tổng hàng bạn chọn là: " + TongDuongCheoChinh(array));
    }
    public static double TongDuongCheoChinh(double[][] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i][i];
        }
        return result;
    }
}
