package The150TasksChallenge;

import java.util.Scanner;

// Task 74.
public class ArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[5];

        for (int i = 0; i < array.length; i ++){
            array[i] = scanner.nextInt();
        }

        if (array[0] == 10 && array[array.length - 1] == 10){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
