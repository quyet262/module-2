package ss2.bai_tap;

import java.util.Scanner;

public class bai1_SelectImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1:Print the rectangle");
        System.out.println("Enter 2:Print the square triangle ");
        System.out.println("Enter 3:Print isosceles triangle");
        System.out.println("Enter 4:Exit");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                printRectangle();
                break;
            case 2:
                System.out.println("Print the square triangle");
                printSquareTriangle();
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                printIsoscelesTriangle();
                break;
            case 4:
                System.out.println("Exitting...");
                break;
            default:
                System.out.println("No valid choice!");
        }
    }
    public static void printRectangle(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printSquareTriangle() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printIsoscelesTriangle() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
