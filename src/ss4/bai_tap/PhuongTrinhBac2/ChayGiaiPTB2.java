package ss4.bai_tap.PhuongTrinhBac2;

import java.util.Scanner;

public class ChayGiaiPTB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Giá trị a: ");
        int a = sc.nextInt();
        System.out.println("Nhập giá trị b: ");
        int b = sc.nextInt();
        System.out.println("Nhập giá trị c: ");
        int c = sc.nextInt();
        GiaiPTB2 giaiPTB2 = new GiaiPTB2(a, b, c);
        System.out.println("Phương trình bạn nhập là: " + a + "x2 + " + b + "x + " + c);
        System.out.print(giaiPTB2.getNghiem());
    }
}
