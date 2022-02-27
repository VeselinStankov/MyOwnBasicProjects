package The150TasksChallenge;

import java.util.Scanner;

// Task 80.
public class LargerValueOfAnArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[3];

        for (int i = 0; i < array.length; i ++){
            array[i] = scanner.nextInt();
        }

        int max = 0;

        if (array[0] >= array[2]){
            max = array[0];
        }
        else {
            max = array[2];
        }

        System.out.println(max);
    }
}
