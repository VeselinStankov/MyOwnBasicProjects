package The150TasksChallenge;

import java.util.Scanner;

// Task 68.
public class CopiesOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = a.substring(a.length() - 3);

        System.out.println(b + b + b + b);
    }
}
