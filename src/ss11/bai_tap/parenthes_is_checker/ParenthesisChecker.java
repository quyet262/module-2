package ss11.bai_tap.parenthes_is_checker;

import java.util.Stack;

public class ParenthesisChecker {
    public static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char s : str.toCharArray()) {
            if (s == '(') {
                stack.push(s);
            } else if (s == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
