package ss13.thuc_hanh.algorithm_complexity_test;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmComplexityTest {
    public static void algorithmComplexityTest(String str) {
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            List<Character> temp = new ArrayList<>();
            temp.add(chars[i]);
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    temp.add(chars[j]);
                }
            }
          if(temp.size() > list.size()) {
              list.clear();
              list.addAll(temp);
          }
          temp.clear();
        }
        System.out.println("Kí tự xuất hiện niều nhất trong chuỗi là: " + list.getFirst() + " xuất hiện: " + list.size() + " lần." );
    }
}
