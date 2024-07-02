package ss19.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(http|https)+://+(www.|)+[a-zA-Z0-9]+.vn");
        Matcher matcher = pattern.matcher("https://codegyme.vn");
        System.out.println(matcher.matches());




        // quyet2621994@gmail.com
        //123@gmail.com

    }
}
