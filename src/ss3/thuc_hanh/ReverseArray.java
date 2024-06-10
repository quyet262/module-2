package ss3.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chieuDai;
        int [] array;
        do {
            System.out.print("Chieu dai: ");
            chieuDai = scanner.nextInt();
            array = new int[chieuDai];
            if (chieuDai > 20) {
                System.out.print("Nhập chiều dài <=20: ");
            }
        }while(chieuDai > 20);
        for (int i = 0; i < chieuDai; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            System.out.print(" Giá trị thứ: " + i + " là: " + array[i]);
            System.out.println();
        }
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.print("Mảng sau đảo ngược là: " + Arrays.toString(array));
    }
}
