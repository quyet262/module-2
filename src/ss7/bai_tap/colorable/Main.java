package ss7.bai_tap.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(1.0);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6);
        shapes[3] = new Circle(9.0);
        shapes[4] = new Rectangle(1, 4);

        for (Shape s : shapes) {
            System.out.println("Area of shape is: " + s.getArea());
            if (s instanceof Colorable) {
                Colorable colorable = (Colorable) s;
                colorable.howToColor();
            }
        }
    }
}
