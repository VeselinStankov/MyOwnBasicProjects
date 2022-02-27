package The150TasksChallenge;

import java.util.Scanner;

// Task 54.
public class ComparingIntegerDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        String number1 = Integer.toString(a);
        String number2 = Integer.toString(b);
        String number3 = Integer.toString(c);

        if (number1.charAt(0) == number2.charAt(0) || number1.charAt(0) == number3.charAt(0) || number2.charAt(0) == number3.charAt(0)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
