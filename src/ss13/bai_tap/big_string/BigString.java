package ss13.bai_tap.big_string;

import java.util.LinkedList;

public class BigString {
    public static void bigString(String string) {
        char[] chars = string.toCharArray();
        LinkedList<Character> max = new LinkedList<>();
        for(int i = 0; i < chars.length; i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(chars[i]);
            for(int j = 1; j < chars.length; j++) {
                if(chars[j] > temp.getLast()) {
                    temp.add(chars[j]);
                }
            }
            if(temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }
        for(Character c : max) {
            System.out.print(c);
        }
    }
}
