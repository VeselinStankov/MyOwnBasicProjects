package The150TasksChallenge;

import java.util.Scanner;
// Task 24.
public class ConvertBinaryToOctal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int result = Integer.parseInt(a,2);

        String octalResult = Integer.toOctalString(result);

        System.out.println(octalResult);
    }
}
