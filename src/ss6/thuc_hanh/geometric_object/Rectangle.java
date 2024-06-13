package ss6.thuc_hanh.geometric_object;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle() {}
    public Rectangle(double witgh, double height) {
        this.width = witgh;
        this.length = height;
    }
    public Rectangle(double witgh, double height, String color, boolean filled) {
        super(color, filled);
        this.width = witgh;
        this.length = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
