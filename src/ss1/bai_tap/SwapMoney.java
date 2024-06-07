package ss1.bai_tap;

import java.util.Scanner;

public class SwapMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap đô:");
        double usd = scanner.nextDouble();
        double vnd = usd * 24000;
        System.out.print(usd + " usd được " + vnd + "đồng");
    }
}
