package The150TasksChallenge;

import java.util.Scanner;

// Task 11.
public class AreaPerimeterCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        System.out.printf("Perimeter is = %f\n",2*Math.PI*r);
        System.out.printf("Area is = %f\n",Math.PI*r*r);

    }
}
