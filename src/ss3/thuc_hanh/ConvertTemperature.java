package ss3.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double doC;
        double doF;
        int luaChon;
        do {
            System.out.println("Nhập 1 để đổi độ c sang độ f: ");
            System.out.println("Nhập 2 để đổi độ f sang độ c: ");
            System.out.println("Nhập 3 để thoát: ");
            System.out.println("Nhập lựa chọn: ");
            luaChon = input.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.print("nhập độ c: ");
                    doC = input.nextDouble();
                    chuyenDoCSangF(doC);
                    System.out.println(doC + " độ c là " + chuyenDoCSangF(doC) + " độ f.");
                    break;
                case 2:
                    System.out.print("Nhập độ f: ");
                    doF = input.nextDouble();
                    chuyenDoFSangC(doF);
                    System.out.println(doF + " độ f là " + chuyenDoFSangC(doF) + " độ c.");
                    break;
                case 0:
                    System.exit(0);
            }

        }while (luaChon != 0);

    }
    public static double chuyenDoCSangF(double c) {
        double f;
        f = c / 9 * 5.0 + 32;
        return f;
    }
    public static double chuyenDoFSangC(double f) {
        double c;
        c = (5.0/9) * (f - 32);
        return c;
    }
}
