package The150TasksChallenge;

import java.util.Scanner;

// Task 108.
public class AddingDigitsOfAnInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String input = Integer.toString(n);

        int result = 0;

        for (int i = 0; i < input.length(); i++){
            result += Character.getNumericValue(input.charAt(i));
        }

        System.out.println(result);
    }
}
