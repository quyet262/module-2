package ss1.bai_tap;

import java.util.Scanner;

public class bai3_SwapNumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number : ");
            number = scanner.nextInt();
        } while (number < 0 && number > 999);
        System.out.print(docChu(number));
    }

    public static String docChu(int number) {
        String chu = "";
        String[] a = {"", " Một ", " Hai ", " Ba ", " Bốn ", " Năm ", " Sáu ", " Bảy ", " Tám ", " Chín "};
        String[] b = {"", " Mười ", " Hai mươi ", " Ba mươi ", " Bốn mươi ", " Năm mươi ", " Sáu mươi ", " Bảy mươi ", " Tám mươi ", " Chín mươi "};
        if (number == 0) {
            chu += "Không";
        } else if (number < 10) {
            chu += a[number];
        } else if (number < 100) {
            chu += b[number / 10];
            chu += a[number % 10];
        } else {
            chu += a[number / 100] + " Trăm ";
            number = number % 100;
            chu += b[number / 10];
            chu += a[number % 10];

        }
        return chu;
    }
}
