package The150TasksChallenge;

import java.util.Scanner;

// Task 30.
public class ConvertHexadecimalToOctal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int result = Integer.parseInt(a,16);

        String octalResult = Integer.toOctalString(result);

        System.out.println(octalResult);
    }
}
