public class ExampleSealedClass {

    public static void main(String[] args) {
        System.out.println("ExampleSealedClass Test");
        Circle circle = new Circle();
        System.out.println(circle.radius);

        Square square = new Square();
        System.out.println(square.side);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.width);

        FilledRectangle filledRectangle = new FilledRectangle();
        System.out.println(filledRectangle.red);
        System.out.println(filledRectangle.green);
        System.out.println(filledRectangle.blue);

        Tringle tringle = new Tringle();
        System.out.println(tringle.angle);
    }
}

sealed class Shape permits Circle, Square, Rectangle {
    public int round = 8;
}

final class Circle extends Shape {
    Shape shape = new Shape();
    public float radius = 2 * (float) shape.round;
}

non-sealed class Square extends Shape {
    Shape shape = new Shape();
    public double side = 7.8 * (double) shape.round;
}

sealed class Rectangle extends Shape permits FilledRectangle {
    Shape shape = new Shape();
    public int length = 5, width = 15;
}

final class FilledRectangle extends Rectangle {
    Shape shape = new Shape();
    Rectangle rectangle = new Rectangle();
    public int red = 1 + rectangle.round, green = 2 + rectangle.length, blue = 3 + shape.round;
}

class Tringle {
    Shape shape = new Shape();
    public int angle = 1 * shape.round;
}