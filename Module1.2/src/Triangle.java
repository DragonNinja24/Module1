public class Triangle extends TwoDShape //Basically C# inheritance but in Java, you can't include anything from the parent class
{
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height)
    {
        super(width, height);
    }

    @Override
    public double getArea() {
        return getArea();
    }

    public  Triangle(double side1, double side2, double side3)
    {
        super();

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        super.setWidth(side1);
        super.setHeight(heronsHeight(side1, side2, side3));
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
        return "" + this.height + " " + this.width;
    }
}
