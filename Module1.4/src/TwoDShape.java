public abstract class TwoDShape

{
        double width;
        double height;
        Color color;

        public TwoDShape( double width, double height, Color color)
        {
                this.width = width;
                this.height = height;
                this.color = color;
        }
        public TwoDShape(Color color)
        {
                this.color = color;
        }

        public double getWidth()
        {
                return width;
        }
        public double getHeight()
        {
                return height;
        }
        public void setWidth (double Width)
        {
                this.width = width;
        }
        public void setHeight ( double Height)
        {
                this.height = height;
        }
        public Color getColor()
        {
                return color;
        }
        public void setColor()
        {
                this.color = color;
        }
        public abstract double getArea();
}

