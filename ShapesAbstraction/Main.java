package ShapesAbstraction;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,2,3);
        RtTriangle rtTriangle = new RtTriangle(3,2,1);

        rectangle.getArea();
        rectangle.getPerimeter();

        System.out.println();

        rtTriangle.getArea();
        rtTriangle.getPerimeter();

        System.out.println();

        rectangle.resize(2);

        rectangle.getArea();
        rectangle.getPerimeter();

        System.out.println();

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(rectangle);
        shapes.add(rtTriangle);

        for (int i = 0; i < shapes.size(); i ++){
            if (shapes.get(i) instanceof Resizable){
                ((Resizable) shapes.get(i)).resize(0.5);
            }
        }

        rectangle.getArea();
        rectangle.getPerimeter();

    }
}
