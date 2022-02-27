package The150TasksChallenge;

import java.util.Scanner;

// Task 18.
public class MultiplyTwoBinaryNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();


        System.out.printf("Product of two binary numbers: %s",MultiplyBinary(a,b));

    }

    public static String MultiplyBinary(String a,String b){

        int number0 = Integer.parseInt(a,2);
        int number1 = Integer.parseInt(b,2);

        return Integer.toBinaryString(number0 * number1);
    }
}

