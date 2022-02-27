package The150TasksChallenge;

import java.util.Scanner;

// Task 83.
public class MultiplyingArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [5];
        int [] array2 = new int [5];

        for (int i = 0; i <= array.length - 1; i ++){
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j <= array2.length - 1; j ++){
            array2[j] = scanner.nextInt();
        }

        int [] arrayResults = new int [5];

        for (int k = 0; k < array.length; k ++){
            arrayResults[k] = array[k] * array2[k];
        }

        System.out.println(arrayResults[0] + " " + arrayResults[1] + " " + arrayResults[2] + " " + arrayResults[3] + " " + arrayResults[4]);


    }
}
