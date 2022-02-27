package The150TasksChallenge;

import java.util.Arrays;
import java.util.Scanner;

// Task 103.
public class TransferringElementsBetweenArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int[] arrayResults = new int[5];

        int counterTens = 0;

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < array.length; i ++){
            if (counterTens >= 1){
                arrayResults[i - 5] = array[i];
            }
            if (array[i] == 10){
                counterTens ++;
            }
        }

        System.out.println(Arrays.toString(arrayResults));

    }
}
