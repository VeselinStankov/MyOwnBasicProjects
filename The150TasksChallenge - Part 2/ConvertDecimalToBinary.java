package The150TasksChallenge;

import java.util.Scanner;

// Task 19.
public class ConvertDecimalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        String result = Integer.toBinaryString(a);

        System.out.println(result);
    }
}
