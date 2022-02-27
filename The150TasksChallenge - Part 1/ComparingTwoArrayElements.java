package The150TasksChallenge;

import java.util.Scanner;

// Task 76.
public class ComparingTwoArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[3];
        int [] array2 = new int[3];

        for (int i = 0; i < array.length; i ++){
            array[i] = scanner.nextInt();
        }

        for (int j = 0; j < array2.length; j ++){
            array2[j] = scanner.nextInt();
        }

        if (array[0] == array2[0] || array[array.length - 1] == array2[array2.length - 1]){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
