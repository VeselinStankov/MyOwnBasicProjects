package The150TasksChallenge;

import java.util.Arrays;
import java.util.Scanner;

// Task 95.
public class FillAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] array = new String[n];

        for (int i = 0; i < n; i ++){
            array[i] = Integer.toString(i);
        }

        System.out.println(Arrays.toString(array));
    }
}
