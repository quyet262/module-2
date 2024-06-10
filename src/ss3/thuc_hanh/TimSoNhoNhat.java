package ss3.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int [] arr;
        System.out.print("Nhập chiều dài mảng: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập phần tử thứ " + i + " của mảng");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa tạo là " + Arrays.toString(arr));
        System.out.print("phần tử nhỏ nhất của mảng bạn vừa tạo la: " + timSoNhoNhat(arr));


    }
    public static int timSoNhoNhat(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
