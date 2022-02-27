package The150TasksChallenge;

import java.util.Scanner;

// Task 41.
public class AsciiValueOfCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);

        int result = a;

        System.out.printf("The ascii value of %c is: %d",a,result);
    }
}
