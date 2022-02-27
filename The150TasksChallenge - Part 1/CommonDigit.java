package The150TasksChallenge;

import java.util.Scanner;

// Task 64.
public class CommonDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        String number1 = Integer.toString(a);
        String number2 = Integer.toString(b);

        if (number1.charAt(0) == number2.charAt(0)){
            System.out.println(true);
        }
        else if (number1.charAt(0) == number2.charAt(1)){
            System.out.println(true);
        }
        else if (number1.charAt(1) == number2.charAt(0)){
            System.out.println(true);
        }
        else if (number1.charAt(1) == number2.charAt(1)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
