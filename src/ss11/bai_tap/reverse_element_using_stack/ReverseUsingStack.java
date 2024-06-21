package ss11.bai_tap.reverse_element_using_stack;

import java.util.Stack;

public class ReverseUsingStack {
   public static void reverseIntegerStack(int[] arr) {
       Stack<Integer> stack = new Stack<>();
       for(int i:   arr){
           stack.push(i);
       }
       for(int i = 0; i< arr.length; i++){
           arr[i] = stack.pop();
       }
   }
   public static String  reverseStringStack(String str) {
       Stack<String> stack = new Stack<>();
       String[] words = str.split(" ");
       for(String word:words){
           stack.push(word);
       }
       String reversedStr = "";
       while(!stack.isEmpty()){
           reversedStr += stack.pop();
           if(!stack.isEmpty()){
               reversedStr += " ";
           }
       }
       return reversedStr.toString();
   }
}

