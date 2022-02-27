package The150TasksChallenge;

import java.util.Locale;
import java.util.Scanner;

// Task 58.
public class CapitalizeTheFirstLetterInASentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1));

    }
}
