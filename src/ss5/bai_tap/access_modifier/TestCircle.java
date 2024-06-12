package ss5.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
        circle.getRadius();
        circle.setRadius(3.0);
        circle.setColor("blue");
        System.out.println(circle.getArea());
    }
}
