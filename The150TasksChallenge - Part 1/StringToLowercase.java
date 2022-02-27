package The150TasksChallenge;

import java.util.Locale;
import java.util.Scanner;

// Task 59.
public class StringToLowercase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        System.out.println(a.toLowerCase(Locale.ROOT));
    }
}
