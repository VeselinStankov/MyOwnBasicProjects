package The150TasksChallenge;

import java.util.Scanner;

// Task 67.
public class InsertAStringInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = "Java 3.0";
        String b = scanner.nextLine();

        String [] c = a.split(" ");

        System.out.println(c[0] + " " + b + " " + c[1]);;

    }
}
