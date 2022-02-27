package The150TasksChallenge;

import java.util.Scanner;

// Task 5.
public class MultiplyTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d x %d = %d",a,b,a*b);

    }
}
