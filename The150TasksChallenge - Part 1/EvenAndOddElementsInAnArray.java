package The150TasksChallenge;

import java.util.Scanner;

// Task 92.
public class EvenAndOddElementsInAnArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [3];
        int evenCounter = 0;
        int oddCounter = 0;

        for (int i = 0; i <= array.length - 1; i ++){
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0){
                evenCounter ++;
            }
            else {
                oddCounter ++;
            }
        }

        System.out.println("Even Numbers: " + evenCounter);
        System.out.println("Odd Numbers: " + oddCounter);

    }
}
