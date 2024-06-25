package ss13.bai_tap.big_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi bạn cần kiểm tra: ");
        String str = sc.nextLine();
        BigString.bigString(str);
    }
}
