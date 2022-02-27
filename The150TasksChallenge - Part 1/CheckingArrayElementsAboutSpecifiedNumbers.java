package The150TasksChallenge;

import java.util.Scanner;

// Task 97.
public class CheckingArrayElementsAboutSpecifiedNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int specifiedNumber = Integer.parseInt(scanner.nextLine());

        int[] array = new int[5];

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < array.length; i ++){
            if (array[i] == specifiedNumber && array[i + 1] == specifiedNumber) {
                System.out.println("Numbers are next to each other");
            }
            if (array[i] == specifiedNumber && array[i + 2] == specifiedNumber) {
                System.out.println("The number is separated by one!");
            }
        }
    }
}
