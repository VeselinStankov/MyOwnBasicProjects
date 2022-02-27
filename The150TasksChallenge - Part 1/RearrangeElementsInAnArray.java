package The150TasksChallenge;

import java.util.Scanner;

// Task 94.
public class RearrangeElementsInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [5];

        for (int i = 0; i <= array.length - 1; i ++) {
            array[i] = scanner.nextInt();
        }

        int [] array2 = new int [5];
        int counter = -1;

        for (int j = 0; j < array.length; j ++){
            if (array[j] % 2 != 0){
                counter ++;
                array2[counter] = array[j];
            }
        }

        for (int k = 0; k < array.length; k ++){
            if (array[k] % 2 == 0){
                counter ++;
                array2[counter] = array[k];
            }
        }

        System.out.println(array2[0] + " " + array2[1] + " " + array2[2] + " " + array2[3] + " " + array2[4]);

    }
}
