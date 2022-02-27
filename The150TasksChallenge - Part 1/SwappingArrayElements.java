package The150TasksChallenge;

import java.util.Scanner;

// Task 81.
public class SwappingArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [3];

        for (int i = 0; i <= array.length - 1; i ++){
            array[i] = scanner.nextInt();
        }

        int temp;

        temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
