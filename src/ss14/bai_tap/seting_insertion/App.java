package ss14.bai_tap.seting_insertion;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài mảng: ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            array[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Mảng bạn vừa tạo: \n" + Arrays.toString(array));
        SetingInsertion.setingInsertion(array);
    }
}
