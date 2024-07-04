package ss19.bai_tap.validate_phonenumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_PhoneNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
        Matcher matcher = pattern.matcher("(84)-(0978489648)");
        System.out.println(matcher.matches());
    }
}
