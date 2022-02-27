package The150TasksChallenge;

import java.util.Scanner;

// Task 101.
public class CountingArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];

        int twentyCounter = 0;
        int tenCounter = 0;

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());

            if (array[j] == 10){
                tenCounter ++;
            }
            if (array[j] == 20){
                twentyCounter ++;
            }
        }

        if (tenCounter > twentyCounter){
            System.out.println("There are more tens");
        }
        else if (twentyCounter > tenCounter){
            System.out.println("There are more twenties");
        }
        else if (tenCounter == 0 ){
            System.out.println("There are neither tens or twenties");
        }
        else {
            System.out.println("There are the same number of tens and twenties");
        }

    }
}
