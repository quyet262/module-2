package ss11.bai_tap.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static String isPalindrome(String str) {
        str = str.toLowerCase();
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();
        String [] temps = str.split("");
        for(String str1 : temps) {
            stack.push(str1);
            queue.add(str1);
        }
        for (int i = 0; i < temps.length; i++) {
            if (!stack.pop().equals(queue.poll())) {
                return "không phải là palindrome";
            }
        }
        return "là 1 palindrome";
    }
}
