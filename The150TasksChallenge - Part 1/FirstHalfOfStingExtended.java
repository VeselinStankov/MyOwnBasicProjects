package The150TasksChallenge;

import java.util.Scanner;

// Task 72.
public class FirstHalfOfStingExtended {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b;

        if (a.length() >= 3) {
            b = a.substring(0, 3);
        } else if (a.length() == 2) {
            b = a.substring(0, 2) + "#";
        } else if (a.length() == 1) {
            b = a.substring(0, 1) + "##";
        } else {
            b = "###";
        }
        System.out.println(b);
    }
}
