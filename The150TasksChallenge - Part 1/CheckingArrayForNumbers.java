package The150TasksChallenge;

import java.util.Scanner;

// Task 98.
public class CheckingArrayForNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        int twentyCounter = 0;
        boolean flag = false;

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());

            if (array[j] == 20){
                twentyCounter ++;
            }
        }

        for (int i = 0; i < array.length; i ++){

            if (i < array.length - 1) {
                if (twentyCounter >= 3 && array[i] != array[i + 1]) {
                    flag = true;
                }
            }
            if (twentyCounter >= 3 && array[i] != array[array.length - 1]) {
                flag = true;
            }
        }

        System.out.println(flag);
    }
}
