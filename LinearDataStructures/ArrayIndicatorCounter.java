package LinearDataStructures;

import java.util.Scanner;

public class ArrayIndicatorCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        int counter = 1;
        int indicator = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                counter++;
            } else if (counter == array[i - 1]) {
                indicator++;
                counter = 1;
            } else {
                counter = 1;
            }
        }
        if (counter == array[array.length - 1]) {
            indicator++;
        }
        System.out.println(indicator);
    }
}
