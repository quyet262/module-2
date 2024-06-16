package ss7.bai_tap.colorable;

import ss7.bai_tap.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() * (1 + percent / 100));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
