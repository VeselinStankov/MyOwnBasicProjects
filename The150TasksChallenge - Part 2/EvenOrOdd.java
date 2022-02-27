package The150TasksChallenge;

import java.util.Scanner;

// Task 49.
public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int a = Integer.parseInt(scanner.nextLine());

        if (a % 2 == 0){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}
