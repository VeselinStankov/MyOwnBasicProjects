package The150TasksChallenge;

import java.util.Scanner;

// Task 7.
public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i ++){
            System.out.printf("%d x %d = %d\n",a,i,a*i);
        }
    }
}
