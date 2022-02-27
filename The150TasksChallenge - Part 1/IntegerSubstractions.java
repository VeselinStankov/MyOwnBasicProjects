package The150TasksChallenge;

import java.util.Scanner;

// Task 62.
public class IntegerSubstractions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a >= 20 && a < b - c){
            System.out.println(true);
        }
        else if (a >= 20 && a < c - b){
            System.out.println(true);
        }
        else if (b >= 20 && b < a - c){
            System.out.println(true);
        }
        else if (b >= 20 && b < c - a){
            System.out.println(true);
        }
        else if (c >= 20 && c < a - b){
            System.out.println(true);
        }
        else if (c >= 20 && c < b - a){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
