package The150TasksChallenge;

import java.util.Scanner;

// Task 105.
public class CheckingForAnArrayInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int[] specifiedNumbers = new int[3];
        int counterBeginning = 0;
        int counterEnd = 0;

        for (int j = 0; j < specifiedNumbers.length; j++) {
            specifiedNumbers[j] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
            if (j <= specifiedNumbers.length - 1){
                if (array[j] == specifiedNumbers[j]){
                    counterBeginning ++;
                }
            }
            if (j >= array.length - 3){
                if (array[j] == specifiedNumbers[j - 7]){
                    counterEnd ++;
                }
            }
        }
        if (counterBeginning + counterEnd == 6){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
