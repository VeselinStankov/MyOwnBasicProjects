package The150TasksChallenge;

import java.util.Scanner;

// Task 85.
public class DoesAStringStartWith {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        if (a.substring(0,5).equals("Hello")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
