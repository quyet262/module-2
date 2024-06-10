package ss3.bai_tap;

import java.util.Scanner;

public class DemLanLapKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "ngày mai e đi xa tôi rồi" ;
        System.out.println("Nhập ký tự cần kiểm tra: ");
        String str1 = sc.nextLine();
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((String.valueOf(str.charAt(i))).equals(str1)) {
                dem++;
            }
        }
        System.out.print("số lan kí tự bạn nhập có trong chuỗi là: " + dem);
    }
}
