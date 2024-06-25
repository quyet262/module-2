package ss11.bai_tap.count_words;

import java.util.Map;
import java.util.TreeMap;

public class CountWords {
    public static void countWords(String words) {
        words = words.toLowerCase();
        words = words.replaceAll("[^a-zA-Z\\s]", "");
        String[] wordArray = words.split("\\s+");

        Map<String, Integer> map = new TreeMap<>();
        for (String word : wordArray) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // In ra kết quả
        System.out.println(map);
    }
}
