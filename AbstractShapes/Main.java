package AbstractShapes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rectangles: ");
        int rectangles = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of squares: ");
        int squares = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of circles: ");
        int circles = Integer.parseInt(scanner.nextLine());

        Area area = new Area();

        for (int i = 0; i < rectangles; i ++){
            System.out.print("Enter width of the rectangle: ");
            area.setWidth(Double.parseDouble(scanner.nextLine()));
            System.out.print("Enter height of the rectangle: ");
            area.setHeight(Double.parseDouble(scanner.nextLine()));

            System.out.print("The area of the rectangle with width: " + area.getWidth() + " and height: " + area.getHeight() + " is: ");
            area.rectangleArea(area.getWidth(), area.getHeight());

        }

        for (int i = 0; i < squares; i ++){

            System.out.print("Enter side of the square: ");
            area.setSide(Double.parseDouble(scanner.nextLine()));

            System.out.print("The area of the square with side: " + area.getSide() + " is: ");
            area.squareArea(area.getSide());

        }

        for (int i = 0; i < circles; i ++){

            System.out.print("Enter radius of the circle: ");
            area.setRadius(Double.parseDouble(scanner.nextLine()));

            System.out.print("The area of the circle with radius: " + area.getRadius() + " is: ");
            area.circleArea(area.getRadius());

        }

        System.out.println("Thank you for using our program.");
    }
}
