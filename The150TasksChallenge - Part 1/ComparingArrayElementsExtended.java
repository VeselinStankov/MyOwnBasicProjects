package The150TasksChallenge;

import java.util.Scanner;

// Task 93.
public class ComparingArrayElementsExtended {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [3];

        for (int i = 0; i <= array.length - 1; i ++) {
            array[i] = scanner.nextInt();
        }

        boolean a = false;
        for (int j = 0; j <= array.length - 1; j ++){
            if (j != array.length - 1) {
                if (array[j] == array[j + 1] && array[j] == 10 || array[j] == array[j + 1] && array[j] == 20) {
                    a = true;
                    break;
                }
                else {
                    a = false;
                }
            }
            else {
                a = false;
            }
        }

        if (a){
            System.out.println(a);
        }
        else {
            System.out.println(a);
        }
    }
}
