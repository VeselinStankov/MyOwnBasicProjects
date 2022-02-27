package The150TasksChallenge;

import java.util.Scanner;
// Task 33.
public class SumOfTwoDigitsOfANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        char firstDigit = a.charAt(0);
        char secondDigit = a.charAt(1);

        int number1 = Character.getNumericValue(firstDigit);
        int number2 = Character.getNumericValue(secondDigit);

        System.out.printf("The sum of the two digits is: %d",number1 + number2);

    }
}
