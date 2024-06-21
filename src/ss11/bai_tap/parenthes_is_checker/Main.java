package ss11.bai_tap.parenthes_is_checker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression to test : ");
        String exp = sc.nextLine();
        if(ParenthesisChecker.checkParenthesis(exp)){
            System.out.println("well");
        }else {
            System.out.println("????");
        }
    }
}
