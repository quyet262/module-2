package ss11.bai_tap.convert_decimal_to_binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();
        String arr = ConvertDecimalToBinary.convertDecimalToBinary(decimal);
        System.out.println(arr.toString());
    }
}
