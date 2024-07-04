package ss19.bai_tap.validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(C|A|P)[0-9]{4}(G|H|I|K)$");
        Matcher matcher = pattern.matcher("M0318G");
        System.out.println(matcher.matches());
    }
}
