package The150TasksChallenge;

import java.util.Scanner;

// Task 79.
public class RotateAnArrayLeft {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[3];

        for (int i = 0; i < array.length; i ++){
            array[i] = scanner.nextInt();
        }

        int temp;

        temp = array[1];
        array[1] = array[2];
        array[2] = array[0];
        array[0] = temp;

        System.out.println(array[0] + " " + array[1] + " " + array[2]);


    }
}
