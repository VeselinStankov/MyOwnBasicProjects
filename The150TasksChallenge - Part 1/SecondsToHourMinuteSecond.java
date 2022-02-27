package The150TasksChallenge;

import java.util.Scanner;

// Task 55.
public class SecondsToHourMinuteSecond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        System.out.println(a/3600  + ":" + a/60%60 + ":" + a % 60);
    }
}
