package ss13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<User>();
        users.add(new User("John", "John@gmail.com", RoleCount.ROLE_ADMIN));
        users.add(new User("Jane", "Jane@gmail.com", RoleCount.ROLE_USER));
        users.add(new User("Bob", "Bob@gmail.com", RoleCount.ROLE_USER));
        users.add(new User("Alice", "Alice@gmail.com", RoleCount.ROLE_ADMIN));
        int demAd = 0;
        int denUs = 0;
        for (User user : users) {
            if (user.getRole() == RoleCount.ROLE_ADMIN) {
                demAd++;
            } else {
                denUs++;
            }
        }
        System.out.println("số phần tử có role admin là " + demAd);
        System.out.println("Số phần tử role user là " + denUs);
        System.out.println("nhập email cần tìm: ");
        String email = sc.nextLine();

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                System.out.println(user);
            }else {
                System.out.println(-1);
            }
        }
    }
    private static void checkEmail(List<User> users, String str ){
        for (User user : users) {
            String [] words = user.getEmail().split("");
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(str)) {
                    System.out.println(user);
                    break;
                }
            }
        }
    }
}
