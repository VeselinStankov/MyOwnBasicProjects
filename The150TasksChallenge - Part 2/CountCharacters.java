package The150TasksChallenge;

import java.util.Scanner;

// Task 38.
public class CountCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String letters = scanner.nextLine();

        int letter = 0;
        int number = 0;
        int space = 0;
        int other = 0;

        for (int i = 0; i < letters.length(); i ++){
            if (Character.isLetter(letters.charAt(i))){
                letter ++;
            }
            else if (Character.isDigit(letters.charAt(i))){
                number ++;
            }
            else if (letters.charAt(i) == ' '){
                space ++;
            }
            else {
                other ++;
            }
        }
        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + space);
        System.out.println("Numbers: " + number);
        System.out.println("Other: " + other);
    }
}
