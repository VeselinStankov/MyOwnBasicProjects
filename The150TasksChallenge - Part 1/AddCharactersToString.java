package The150TasksChallenge;

import java.util.Scanner;

// task 84.
public class AddCharactersToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        System.out.println(a.substring(a.length() - 3) + a + a.substring(a.length() - 3));

    }
}
