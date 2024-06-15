package ss7.bai_tap.resizeable.geometric_object;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(1.0);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6);
        shapes[3] = new Circle(9.0);
        shapes[4] = new Rectangle(1, 4);

        for (Shape s : shapes) {
            System.out.println("shape before: " + s);
            System.out.println("Area before: " + s.getArea());
            if (s instanceof Resizeable) {
                Resizeable resizeable = (Resizeable) s;
                resizeable.resize(Math.random() * 100);
                System.out.println("shape after resizeable: " + s);
                System.out.println("Area after: " + s.getArea());
                System.out.println("Perimeter: " + s.getPerimeter());
            }
        }
    }
}
