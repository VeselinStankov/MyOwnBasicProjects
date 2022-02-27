package The150TasksChallenge;

import java.util.Locale;
import java.util.Scanner;

// Task 23.
public class ConvertBinaryToHexadecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int result = Integer.parseInt(a,2);

        String hexadecimalResult = Integer.toHexString(result);

        System.out.println(hexadecimalResult.toUpperCase(Locale.ROOT));
    }
}
