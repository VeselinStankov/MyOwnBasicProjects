package The150TasksChallenge;

import java.util.Scanner;

// Task 75.
public class ComparingArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[5];

        for (int i = 0; i < array.length; i ++){
            array[i] = scanner.nextInt();
        }

        if (array[0] == array[array.length - 1]){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
