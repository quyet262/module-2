package ss2.bai_tap;

public class SNTNhoHon100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.print(i + " ");
                System.out.println();
        }
        }
    }
}
