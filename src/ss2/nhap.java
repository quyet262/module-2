package ss2;

import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.println("Enter a and b(a<b): ");
            System.out.print("Enter a: ");
            a = sc.nextInt();
            System.out.print("Enter b: ");
            b = sc.nextInt();
        }while (a >b);
        int c = 0;
        for( ; a <= b; a++){
            c = c+ a;
        }
        System.out.println(c);
    }
}
