package The150TasksChallenge;

import java.util.Scanner;

// Task 78.
public class CheckingArrayElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[2];

        for (int i = 0; i < array.length; i ++){
            array[i] = scanner.nextInt();
        }

        boolean a = false;

        for (int j = 0; j < array.length; j ++){
            if (array[j] == 4 || array[j] == 7){
                a = true;
                break;
            }
            else {
                a = false;
            }
        }
        if (a == true){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
