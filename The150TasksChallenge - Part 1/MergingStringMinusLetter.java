package The150TasksChallenge;

import java.util.Scanner;

// Task 71.
public class MergingStringMinusLetter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(a.substring(1) + b.substring(1));

    }
}
