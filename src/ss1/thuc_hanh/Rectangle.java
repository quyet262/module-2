package ss1.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in); // khai bao doi tuong scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
