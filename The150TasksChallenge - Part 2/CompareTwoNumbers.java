package The150TasksChallenge;

import java.util.Scanner;

// Task 32.
public class CompareTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (a == b){
            System.out.printf("%d = %d\n",a,b);
        }
        else {
            System.out.printf("%d != %d\n",a,b);
        }
        if (a > b){
            System.out.printf("%d > %d\n",a,b);
        }
        else if (b > a){
            System.out.printf("%d < %d\n",a,b);
        }

    }
}
