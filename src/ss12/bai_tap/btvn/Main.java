package ss12.bai_tap.btvn;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberConverter converter = new NumberConverter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi");
        int decimalNumber = scanner.nextInt();
        System.out.println("Decimal: " + converter.convertDecimal(decimalNumber));
        System.out.println("Binary: " + converter.convertBinary(decimalNumber));
        System.out.println("Octal: " + converter.convertOctal(decimalNumber));
        System.out.println("Hexadecimal: " + converter.convertHexadecimal(decimalNumber));
    }
}