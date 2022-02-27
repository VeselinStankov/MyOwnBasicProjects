package The150TasksChallenge;

import java.util.Scanner;

// Task 12.
public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());

        System.out.println((a + b + c) / 3);

    }
}
