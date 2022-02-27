package The150TasksChallenge;

import java.util.Scanner;

// Task 21.
public class ConvertDecimalToOctal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        String result = Integer.toOctalString(a);

        System.out.println(result);
    }
}
