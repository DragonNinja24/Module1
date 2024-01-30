

public class Triangle extends TwoDShape //Basically C# inheritance but in Java, you can't include anything from the parent class
{
    //Triangle sides
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height)
    {
        super(width, height);//Calls em straight from the TwoDShape constructor
    }
    public Triangle(double side1, double side2, double side3)
    {
        /* Calling the super here
           Side 1 = width
           heronsHeight = height
         */
        super();

        /* Used by heronsHeight
           So they are called before it
         */
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        //Assign base and height
        super.width = side1;
        super.height = heronsHeight(side1, side2, side3);
    }
    private double heronsHeight(double side1, double side2, double side3)
    {
        //Basic heron's formula written in code format
        double sideS = (side1 + side2 + side3) / 2;//Add all sides together then divide by 2
        double triArea = Math.sqrt(sideS * (sideS - side1 * sideS - side2 * sideS - side3));//Find area of the triangle

        double triHeight = (triArea / side2) * 2;//To find the height of the triangle

        return  triHeight;//YAY
    }

    @Override
    public double getArea()
    {
        if (super.width <= 0 || super.height <= 0)
        {
            return 0;//Triangles with negative bases or a height of 0 don't have heights
        }
        return 0.5 * super.width * super.height;
    }
}
