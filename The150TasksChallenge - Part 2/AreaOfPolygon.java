package The150TasksChallenge;

import java.util.Scanner;
// Task 35.
public class AreaOfPolygon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double s = Double.parseDouble(scanner.nextLine());

        System.out.printf("The area is: %f",(n*s*s)/(4*Math.tan(Math.PI/n)));

    }
}
