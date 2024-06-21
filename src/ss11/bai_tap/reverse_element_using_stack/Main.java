package ss11.bai_tap.reverse_element_using_stack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        String str = "Ngày mai sẽ khác";
        ReverseUsingStack.reverseIntegerStack(arr);
        String reverseStr =  ReverseUsingStack.reverseStringStack(str);
        System.out.println(Arrays.toString(arr));
        System.out.println(reverseStr);
    }
}
