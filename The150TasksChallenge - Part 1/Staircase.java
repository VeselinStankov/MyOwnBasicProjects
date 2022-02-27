package The150TasksChallenge;

import java.util.Scanner;

// Task 109.
public class Staircase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = in.nextInt();
        if (n>0)
        {
            System.out.println("Number of rows: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));
        }

    }
}
