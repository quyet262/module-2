package ss2.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        boolean check = true;
        int i = 2;
        if (n < 2) {
            System.out.print("Not Prime number");
        } else {
            while (i < n) {
                if (n % i == 0) {
                    check = false;
                }
                i++;
            }
            if (check) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not Prime number");
            }
        }
    }
}
