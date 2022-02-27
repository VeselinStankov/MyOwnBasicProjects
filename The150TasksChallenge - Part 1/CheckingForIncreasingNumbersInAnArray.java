package The150TasksChallenge;

import java.util.Scanner;

// Task 107.
public class CheckingForIncreasingNumbersInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        boolean flag = false;

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = 0; j < array.length; j++) {

            if (j < array.length - 2) {
                if (array[j] < array[j + 1] && array[j + 1] < array[j + 2]) {
                    flag = true;
                }
            }
            if (array[j] < array[array.length - 1]) {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
