package ss6.bai_tap.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValidTriangle = false;

        do {
            System.out.println("Enter the 3 sides of the triangle: ");
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();

            isValidTriangle = Triangle.isTriangle(side1, side2, side3);

            if (!isValidTriangle) {
                System.out.println("The sides do not form a valid triangle. Please enter again.");
                continue;
            }

            System.out.println("Enter the color of the triangle: ");
            String color = sc.next();
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(false);

            System.out.println("The triangle is " + triangle + ". Area of the triangle is: " + triangle.getArea() +
                    ", Perimeter of the triangle is: " + triangle.getPerimeter());
        } while (!isValidTriangle);
    }
}
