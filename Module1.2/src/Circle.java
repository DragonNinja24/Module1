public class Circle extends TwoDShape
{
    public final double PI = Math.PI;
    private final double radius;

    public Circle(double radius)
    {
        super(2 * radius, 2 * radius);
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        if(radius <= 0.0)
        {
            return 0;
        }
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "width =" + super.getWidth() +
                ", height =" + super.getHeight() +
                ", PI =" + PI +
                ", radius =" + radius +
                ", area =" + getArea() +
                '}';

    }

}
