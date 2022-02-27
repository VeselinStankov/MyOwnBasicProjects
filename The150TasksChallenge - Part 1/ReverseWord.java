package The150TasksChallenge;

import java.util.Scanner;

// Task 61.
public class ReverseWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] a = scanner.nextLine().toCharArray();

        for (int i = a.length - 1; i >= 0; i --){
            System.out.print(a[i]);
        }

    }
}
