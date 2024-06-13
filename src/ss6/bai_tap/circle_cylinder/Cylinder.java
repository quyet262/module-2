package ss6.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double hieght;

    public Cylinder() {
    }

    public Cylinder(double hieght) {
        this.hieght = hieght;
    }

    public Cylinder(double hieght, double radius, String color) {
        super(radius, color);
        this.hieght = hieght;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public double getcylindricalVolume() {
        return super.getArea() * hieght;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hieght=" + hieght +
                "; Volume= " + getcylindricalVolume() +
                '}';
    }
}
