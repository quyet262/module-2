package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrays [][];
        System.out.print("Nhập chiều dài của mảng: ");
        int n = sc.nextInt();
        arrays = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập so phần tử của hàng " + i );
            int x = sc.nextInt();
            arrays[i] = new int[x];
            for (int j = 0; j < x; j++) {
                System.out.print("nhâp giá trị ở " + i + j + " của mảng: ");
                int y = sc.nextInt();
                arrays[i][j] = y;
            }
        }
        System.out.println("Mảng vừa tạo: " + Arrays.deepToString(arrays));
        int max = timMax(arrays);
        System.out.print("Giá trị lớn nhất của mảng bạn vừa tạo là: " + max);
    }
  public static int timMax(int [][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
  }
}
