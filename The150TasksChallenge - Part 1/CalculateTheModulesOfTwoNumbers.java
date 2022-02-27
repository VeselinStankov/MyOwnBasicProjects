package The150TasksChallenge;

import java.util.Scanner;

// Task 65.
public class CalculateTheModulesOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int result = a - ((a / b) * b);

        System.out.println(result);

    }
}
