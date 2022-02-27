package The150TasksChallenge;

import java.util.Scanner;

// Task 53.
public class ThreeGreaterIntegers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(a < b && b < c);
    }
}
