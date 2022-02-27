package The150TasksChallenge;

import java.util.Scanner;

// Task 111.
public class AddingWithoutArithmetics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: " + x);
        System.out.print("\n");
    }
}
