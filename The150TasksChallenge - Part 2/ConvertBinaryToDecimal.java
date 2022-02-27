package The150TasksChallenge;

import java.util.Scanner;

// Task 22.
public class ConvertBinaryToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int result = Integer.parseInt(a,2);

        System.out.println(result);
    }
}
