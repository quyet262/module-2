package ss13.bai_tap.binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        boolean flag = false;
        while (!flag) {
            System.out.println("1. Tạo mảng: ");
            System.out.println("2. Nhập giá trị bạn cần tìm.");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("nhập phần tử");
                    int n = sc.nextInt();
                    list.add(n);
                    break;
                case 2:
                    Collections.sort(list);
                    System.out.println("Mảng bạn tạo sau khi sắp xếp tăng dần: " + list);
                    System.out.println("Nhập giá trị bạn cần tìm: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    int high = list.size() - 1;
                    int low = 0;
                    int temp = BinarySearch.binarySearch(list, index, low, high);
                    System.out.println("giá trị bạn cần tìm ở vị trí " + temp + " trong mảng");
                    break;
                case 3:
                    flag = true;
                    sc.close();
                    break;
            }
        }


    }

}
