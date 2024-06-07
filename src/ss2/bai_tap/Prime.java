package ss2.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        int dem = 0;
        for (int i = 2; dem < 20; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                dem++;
                System.out.print(i + " ");
                System.out.println();
            }

        }
        System.out.print("số lượng snt là: " + dem );
    }

}
