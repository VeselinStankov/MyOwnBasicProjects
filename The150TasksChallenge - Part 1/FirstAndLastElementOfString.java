package The150TasksChallenge;

import java.util.Scanner;

// Task 73.
public class FirstAndLastElementOfString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.length() == 0){
            a = "#";
        }
        if (b.length() == 0){
            b = "#";
        }

        System.out.println(a.charAt(0)+b.substring(b.length()-1));
    }
}
