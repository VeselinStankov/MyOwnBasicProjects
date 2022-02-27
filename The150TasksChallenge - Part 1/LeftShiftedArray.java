package The150TasksChallenge;

import java.util.Arrays;
import java.util.Scanner;

// Task 106.
public class LeftShiftedArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        int temp;
        int[] arrayResults = new int[5];

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < arrayResults.length; i ++){
            arrayResults[arrayResults.length - 1] = array[0];
            if (i < arrayResults.length - 1) {
                arrayResults[i] = array[i + 1];
            }
            arrayResults[arrayResults.length - 2] = array[array.length - 1];

        }

        System.out.println(Arrays.toString(arrayResults));
    }
}
