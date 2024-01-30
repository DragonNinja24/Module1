import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        ArrayList<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Triangle(1, 9, 9, Color.RED));
        shapes.add(new Circle(1, Color.GREEN));
        shapes.add(new Triangle(23, 6, 1998, Color.BLUE));
        shapes.add(new Circle(23, Color.NONE));
        shapes.add(new Triangle(12, 8, 23, Color.RED));

        for (TwoDShape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + "'s Area= " + shape.getArea());
            System.out.println(shape);
        }
    }
}
