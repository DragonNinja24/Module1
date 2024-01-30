public abstract class TwoDShape

{
        double width;
        double height;

        public TwoDShape( double width, double height)
        {
                this.width = width;
                this.height = height;
        }
        public TwoDShape()
        {

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
        public abstract double getArea();
}

