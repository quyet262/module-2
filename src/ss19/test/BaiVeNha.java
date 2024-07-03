package ss19.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiVeNha {
    public static void main(String[] args) {
//
//        1. Kiểm tra định dan ngày tháng
//            ->dd/mm/yyyy
//            phần ngày: là số và có thể từ 01 đến 31 => (0[1-9]|[12][0-9]|3[01])
//            phần tháng: là số và c thể từ 01 đến 12 => (0[1-9]|1[0-2])
//            phần năm: là 4 chữ số => [0-9]{4}

        Pattern pattern1 = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$");
        Matcher matcher1 = pattern1.matcher("01/10/2013");
        boolean isMatch1 = matcher1.matches();
        System.out.println(isMatch1);


//        2. Kiểm tra giờ hợp lệ: HH:MM (HH - giờ, MM phút)
//        Giờ: từ 00 đến 23 và là số có 2 chữ số
//            => 0 và 1 đến 9 => [01][0-9]
//            => 2 có số từ 0 đến 3 => 2[0-3]
//        Phút: từ 00 đến 59 là số có 2 chữ số
//            => có 2 số từ 00 đến 59 => [0-5][0-9]
//
        Pattern pattern2 = Pattern.compile("^([01][0-9]|2[0-3]):[0-5][0-9]$");
        Matcher matcher2 = pattern2.matcher("12:00");
        boolean isMatch2 = matcher2.matches();
        System.out.println(isMatch2);
//
//        3. Kiểm tra số thẻ tín dụng: Một số thẻ tín dụng thường có 16 chữ số,
//        có thể được nhóm thành 4 nhóm cách nhau bởi dấu gạch ngang (-) hoặc khoảng trắng.
//            AAAA-AAAA-AAAA-AAAA
//            => 3 nhóm đầu tiên có 4 so tu 0-9 và cách nhau boi (-) hoac khoang trang => ([0-9]{4}[- ]){3}
//            => và 4 so cuoi tu 0-9 => [0-9]{4}
//            ==>^([0-9]{4}[- ]){3}[0-9]{4}$
//
        Pattern pattern3 = Pattern.compile("^([0-9]{4}[- ]){3}[0-9]{4}$");
        Matcher matcher3 = pattern3.matcher("8873-9999-9882-8732");
        boolean isMatch3 = matcher3.matches();
        System.out.println(isMatch3);
    }
}