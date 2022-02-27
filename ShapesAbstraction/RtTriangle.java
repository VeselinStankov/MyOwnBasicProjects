package ShapesAbstraction;

public class RtTriangle extends Shape{

    private double width;
    private double height;

    protected RtTriangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double getArea() {
        System.out.println("The Area of the Triangle is: " + (height * width) / 2);
        return 0;
    }

    @Override
    protected double getPerimeter() {
        System.out.println("The Perimeter of the Triangle is: " + (width + height + (Math.sqrt(width * width + height * height))));
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
