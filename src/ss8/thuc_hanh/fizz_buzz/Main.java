package ss8.thuc_hanh.fizz_buzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number need test: ");
        int number = scanner.nextInt();
        System.out.println(FizzBuzz.fizzBuzz(number));
    }
}