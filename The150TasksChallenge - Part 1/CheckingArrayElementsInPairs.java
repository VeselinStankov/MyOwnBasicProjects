package The150TasksChallenge;

import java.util.Scanner;

// Task 99.
public class CheckingArrayElementsInPairs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int specifiedNumber = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int[] array = new int[6];

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < array.length; i ++){
            if (i < array.length - 1) {
                if (array[i] == specifiedNumber && array[i + 1] == specifiedNumber) {
                    flag = true;
                }
            }
            if (array[i] == specifiedNumber && array[array.length - 1] == specifiedNumber) {
                flag = true;
            }
        }

        System.out.println(flag);

    }
}
