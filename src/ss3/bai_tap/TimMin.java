package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chều dài mảng: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị phần tử thứ " + i + " của mảng.");
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa tạo: " + Arrays.toString(array));
        System.out.print("giá trị nhỏ nhất của mảng vừa tạo là : " + timMin(array));

    }
    public static int timMin(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
