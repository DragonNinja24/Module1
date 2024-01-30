import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(1, 9, 9));
        shapes.add(new Circle(1));
        shapes.add(new Triangle(23, 6, 1998));
        shapes.add(new Circle(23));
        shapes.add(new Triangle(12, 8, 23));

        for (TwoDShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + "'s Area= " + shape.getArea());
            System.out.println(shape);
        }
    }
}
