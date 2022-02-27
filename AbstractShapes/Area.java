package AbstractShapes;

public class Area extends Shape{

    private double width;
    private double height;
    private double side;
    private double radius;

    public Area(){}

    public Area(double width, double height, double side, double radius) {
        this.width = width;
        this.height = height;
        this.side = side;
        this.radius = radius;
    }

    @Override
    public double rectangleArea(double width, double height) {
        System.out.println(width*height);
        return width * height;
    }

    @Override
    public double squareArea(double side) {
        System.out.println(side*side);
        return side * side;
    }

    @Override
    public double circleArea(double radius) {
        System.out.println(Math.PI * radius * radius);
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
