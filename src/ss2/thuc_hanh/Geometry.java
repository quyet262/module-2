package ss2.thuc_hanh;

import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();  // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.println("Draw the triangle");
                        drawTriangle();
                        break;
                    case 2:
                        System.out.println("Draw the square");
                        drawSquare();
                        break;
                    case 3:
                        System.out.println("Draw the rectangle");
                        drawRectangle();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("No valid choice!");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                input.next();  // Consume the invalid input
            }
        }
        input.close();
    }

    public static void drawTriangle() {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawSquare() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
