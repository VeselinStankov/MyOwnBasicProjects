package The150TasksChallenge;

import java.util.Scanner;

// Task 63.
public class BiggerInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        while (true) {
            if (a % 6 == b % 6) {
                if (a < b) {
                    System.out.println(a);
                    break;
                } else if (b < a) {
                    System.out.println(b);
                    break;
                }
            }
            if (a > b) {
                System.out.println(a);
                break;
            } else if (b > a) {
                System.out.println(b);
                break;
            } else {
                System.out.println(0);
                break;
            }
        }
    }
}
