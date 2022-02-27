package The150TasksChallenge;

import java.util.Scanner;

// task 82.
public class SumOfArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [5];

        for (int i = 0; i <= array.length - 1; i ++){
            array[i] = scanner.nextInt();
        }

        int max = 0;

        if (array[0] > max){
            max = array[0];
        }
        if (array[array.length - 1] > max){
            max = array[array.length - 1];
        }
        if (array[(array.length - 1) / 2] > max){
            max = array[(array.length - 1) / 2];
        }

        System.out.println(max);

    }
}
