package ss15.bai_tap.Illegal_triangle_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập 3 cạnh của tam giác: ");
            System.out.println("Nhập a: ");
            int a = scanner.nextInt();
            System.out.println("Nhập b: ");
            int b = scanner.nextInt();
            System.out.println("Nhập c: ");
            int c = scanner.nextInt();

            TriangleValidator.validate(a, b, c);
            System.out.println("3 cạnh hợp lệ để tạo thành tam giác.");
        } catch (InputMismatchException e) {
            System.err.println("Vui lòng nhập số nguyên.");
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }
    }
}
