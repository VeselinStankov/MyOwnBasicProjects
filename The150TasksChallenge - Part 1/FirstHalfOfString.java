package The150TasksChallenge;

import java.util.Scanner;

// Task 69.
public class FirstHalfOfString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        String b = a.substring(0,a.length() / 2);

        System.out.println(b);

    }
}
