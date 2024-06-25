package ss13.bai_tap.arrange_characters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        ArrangeCharacters.arrangeCharacters(str);
    }
}
