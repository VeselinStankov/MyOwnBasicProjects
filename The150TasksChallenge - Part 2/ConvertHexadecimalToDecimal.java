package The150TasksChallenge;

import java.util.Locale;
import java.util.Scanner;

// Task 28.
public class ConvertHexadecimalToDecimal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int result = Integer.parseInt(a,16);

        System.out.println(result);

    }
}
