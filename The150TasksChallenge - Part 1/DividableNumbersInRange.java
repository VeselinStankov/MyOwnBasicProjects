package The150TasksChallenge;

import java.util.Scanner;

// Task 56.
public class DividableNumbersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = x; i <= 20; i ++){
            if (i % p == 0){
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
