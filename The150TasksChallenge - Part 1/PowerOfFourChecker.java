package The150TasksChallenge;

import java.util.Scanner;

// Task 110.
public class PowerOfFourChecker {

    public static void main(String[] args) {

        int test = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.print(Boolean.toString(false));
            test = 1;
        }
        if ((n & (n - 1)) != 0) {
            System.out.print(Boolean.toString(false));
            test = 1;
        }
        if (test == 0) {
            System.out.print(Boolean.toString((n & 0x55555555) != 0));
        }
        System.out.print("\n");

    }
}