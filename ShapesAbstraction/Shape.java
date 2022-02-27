package ShapesAbstraction;

public abstract class Shape {

    protected int numSides;

    protected Shape(int numSides) {
        this.numSides = numSides;
    }

    protected int getNumSides(int numSides){
        return numSides;
    }

    protected abstract double getArea();

    protected abstract double getPerimeter();
}
