package ss6.bai_tap.point_moveabalepoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        MoveablePoint p2 = new MoveablePoint(5,10);
        p1.getX();
        p1.getY();
        p2.setX(3);
        p2.setY(5);
        System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p2);
        System.out.println(Arrays.toString(p2.move()));
    }
}
