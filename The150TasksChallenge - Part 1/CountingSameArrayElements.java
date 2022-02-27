package The150TasksChallenge;

import java.util.Scanner;

// Task 100.
public class CountingSameArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[3];

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
        }

        int[] array2 = new int[3];

        for (int j = 0; j < array.length; j++) {
            array2[j] = Integer.parseInt(scanner.nextLine());
        }

        int counter = 0;

        for (int i = 0; i < array.length; i++){

                if (array[i] == array2[i] || array[i] == array2[i] + 1 || array[i] == array2[i] - 1) {
                    counter ++;
            }

        }

        System.out.println(counter);

    }
}
