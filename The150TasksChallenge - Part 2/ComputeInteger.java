package The150TasksChallenge;

import java.util.Scanner;

// Task 44.
public class ComputeInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String number1 = Integer.toString(n);
        String number2 = number1 + number1;
        String number3 = number1 + number1 + number1;

        int number4 = Integer.parseInt(number1);
        int number5 = Integer.parseInt(number2);
        int number6 = Integer.parseInt(number3);

        System.out.printf("%d + %d + %d",number4,number5,number6);

    }
}
