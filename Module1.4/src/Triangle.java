public class Triangle extends TwoDShape implements Rotate //Basically C# inheritance but in Java, you can't include anything from the parent class
{
    double side1;
    double side2;
    double side3;
    private double angle = 0;

    public Triangle(double width, double height, Color color)
    {
        super(width, height, color);
    }

    @Override
    public double getArea() {
        return 0;
    }


    public  Triangle(double side1, double side2, double side3, Color color)
    {
        super(color);

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        setWidth(side1);
        setHeight(heronsHeight(side1, side2, side3));
    }
    private double heronsHeight(double side1, double side2, double side3)
    {
        double sideS = (side1 + side2 + side3) / 2;
        double triArea = Math.sqrt(sideS * (sideS - side1 * sideS - side2 * sideS - side3));

        double triHeight = (triArea / side2) * 2;

        return  triHeight;
    }
    private double GetArea()
    {
        return 0.5 * width * height;
    }
    public String toString()
    {
        return "Triangle{" +
                "width =" + super.getWidth() +
                ", height =" + super.getHeight() +
                ", side1 =" + side1 +
                ", side2 =" + side2 +
                ", side3 =" + side3 +
                ", area =" + getArea() +
                '}';
    }
    @Override
    public void rotate90()
    {
        rotate(90);
    }
    @Override
    public void rotate180()
    {
        rotate(180);
    }
    @Override
    public void rotate(double degree)
    {
        angle += degree;
        angle %= 360;
    }
}
