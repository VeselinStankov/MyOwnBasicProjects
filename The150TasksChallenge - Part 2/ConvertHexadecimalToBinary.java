package The150TasksChallenge;

import java.util.Locale;
import java.util.Scanner;

// Task 29.
public class ConvertHexadecimalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int result = Integer.parseInt(a,16);

        String binaryResult = Integer.toBinaryString(result);
        System.out.println(binaryResult);
    }
}
