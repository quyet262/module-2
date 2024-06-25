package ss12.bai_tap.btvn;

import java.util.Stack;

public class NumberConverter implements ConvertSystem{
    @Override
    public  String convertBinary(int number) {
        Stack<Integer> stack = new Stack();
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }
        String Binary = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            Binary += stack.pop();
        }
        return Binary;
    }

    @Override
    public String convertOctal(int number) {
        Stack<Integer> stack = new Stack();
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            stack.push(number % 8);
            number /= 8;
        }
        String Octal = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            Octal += stack.pop();
        }
        return Octal;
    }

    @Override
    public String convertHexadecimal(int number) {
        Stack<String> stack = new Stack();
        if (number == 0) {
            return "0";
        }
        while (number > 0) {
            String [] unit = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
            stack.push(unit[number%16]);
            number /= 16;
        }
        String Hexadecimal = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            Hexadecimal += stack.pop();
        }
        return Hexadecimal;
    }

    @Override
    public String convertDecimal(int number) {
        return "" + number;
    }
}
