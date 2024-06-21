package ss11.bai_tap.palindrome;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        System.out.println(Palindrome.isPalindrome(word));
        System.out.println(word);
    }
}
