package The150TasksChallenge;

import java.util.Scanner;

// Task 13.
public class AreaPerimeterRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        System.out.printf("Perimeter is 2 *  (%.1f + %.1f) = %.2f\n",a,b,2*a+2*b);
        System.out.printf("Area is %.1f * %.1f %.2f\n",a,b,a*b);
    }
}
