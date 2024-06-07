package ss2.thuc_hanh;

import java.util.Scanner;

public class Th3_GreatestCommomFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Ước chung lớn nhất của " + a + " và " + b + " là: " + gcd(a,b));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
