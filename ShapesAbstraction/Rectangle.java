package ShapesAbstraction;

public class Rectangle extends Shape implements Resizable{

    private double width;
    private double height;

    protected Rectangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double getArea() {
        System.out.println("The Area of the Rectangle is: " + height * width);
        return 0;
    }

    @Override
    protected double getPerimeter() {
        System.out.println("The Perimeter of the Rectangle is: " + (2 * width + 2 * height));
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

    @Override
    public double resize(double x) {
        width = width * x;
        height = height * x;
        return width * height;
    }
}
