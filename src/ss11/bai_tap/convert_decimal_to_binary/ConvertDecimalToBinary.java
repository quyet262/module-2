package ss11.bai_tap.convert_decimal_to_binary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static String convertDecimalToBinary(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            int temp = num % 2;
            num = num / 2;
            list.add(temp);
        }
        Stack<Integer> stack = new Stack<>();
        for(Integer l: list){
            stack.push(l);
        }
        for(int i = 0 ; i < list.size() ; i++){
            list.set(i, stack.pop());
        }
        String result = "";
        for(int i = 0 ; i < list.size() ; i++){
            result += list.get(i);
        }
        return result;
    }
}
