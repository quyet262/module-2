package ss2.bai_tap;

import java.util.Scanner;

public class SelectImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1:Print the rectangle");
        System.out.println("Enter 2:Print the square triangle downleft: ");
        System.out.println("Enter 3:Print the square triangle upleft");
        System.out.println("Enter 4:Print the square triangle upright ");
        System.out.println("Enter 5:Print the square triangle downright");
        System.out.println("Enter 6:Print isosceles triangle ");
        System.out.println("Enter 7:Exit");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                printRectangle();
                break;
            case 2:
                System.out.println("Print the square triangle downleft");
                printSquareTriangleDownLeft();
                break;
            case 3:
                System.out.println("Print isosceles triangle upleft");
                printIsoscelesTriangleUpLeft();
                break;
            case 4:
                System.out.println("Print the square triangle upright");
                printSquareTriangleUpRight();
                break;
            case 5:
                System.out.println("Print the square triangle downright");
                printSquareTriangleDownRight();
                break;
            case 6:
                System.out.println("Print isosceles triangle");
                printIsoscelesTriangle();
                break;
            case 7:
                System.out.println("Exit");
            default:
                System.out.println("No valid choice!");
        }
    }

    public static void printRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleDownLeft() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangleUpLeft() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleUpRight() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleDownRight() {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
