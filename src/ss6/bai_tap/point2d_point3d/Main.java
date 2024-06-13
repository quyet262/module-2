package ss6.bai_tap.point2d_point3d;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        Point3D point3D = new Point3D();
        point2D.setX(4);
        point2D.setY(5);
        point3D.setXYZ(6, 7, 8);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
