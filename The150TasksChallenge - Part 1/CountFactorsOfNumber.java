package The150TasksChallenge;

import java.util.Scanner;

// Task 57.
public class CountFactorsOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 1; i <= a; i ++) {
            if (a % i == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
