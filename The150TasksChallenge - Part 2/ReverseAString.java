package The150TasksChallenge;

import java.util.Scanner;

// Task 37.
public class ReverseAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] letters = scanner.nextLine().toCharArray();

        for (int i = letters.length - 1; i >= 0; i --) {
            System.out.print(letters[i]);
        }
    }
}
