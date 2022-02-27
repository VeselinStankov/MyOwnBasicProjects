package The150TasksChallenge;

import java.util.Scanner;

// Task 34.
public class AreaOfHexagon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double s = Double.parseDouble(scanner.nextLine());

        System.out.printf("The area of the hexagon is: %f",((3*Math.sqrt(3))/2)*s*s);

    }
}
