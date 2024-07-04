package ss21.bai_tap.factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Khởi tạo và sử dụng Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing a Circle

        // Khởi tạo và sử dụng Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw(); // Output: Drawing a Rectangle

        // Khởi tạo và sử dụng Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw(); // Output: Drawing a Square
    }
}
