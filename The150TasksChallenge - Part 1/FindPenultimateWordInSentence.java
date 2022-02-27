package The150TasksChallenge;

import java.util.Scanner;

// Task 60.
public class FindPenultimateWordInSentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String [] words = a.split("[ ]+");

        System.out.println("Penultimate word is: " + words[words.length - 2]);
    }
}
