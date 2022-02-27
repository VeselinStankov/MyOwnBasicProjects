package The150TasksChallenge;

import java.util.Scanner;

// Task 102.
public class CheckingForANumberInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        boolean flag = false;

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
            if (array[j] == 10){
                flag = true;
            }
            if (array[j] == 30){
                flag = true;
            }
        }

        System.out.println(flag);

    }
}
