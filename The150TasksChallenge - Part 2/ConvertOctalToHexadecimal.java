package The150TasksChallenge;

import java.util.Locale;
import java.util.Scanner;

// Task 27.
public class ConvertOctalToHexadecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int result = Integer.parseInt(a,8);

        String hexadecimalResult = Integer.toHexString(result);

        System.out.println(hexadecimalResult.toUpperCase(Locale.ROOT));
    }
}
