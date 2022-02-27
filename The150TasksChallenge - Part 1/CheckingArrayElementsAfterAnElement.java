package The150TasksChallenge;

import java.util.Scanner;

// TAsk 96.
public class CheckingArrayElementsAfterAnElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[5];
        boolean flag = false;
        boolean test = false;

        for (int i = 0; i < array.length; i ++){
            array[i] = Integer.parseInt(scanner.nextLine());
            if (array[i] == 10){
                flag = true;
            }
            if (flag && array[i] == 20){
                test = true;
            }
        }

        if (test){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
