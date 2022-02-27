package The150TasksChallenge;
// Task 50.
public class DividableNumbers {

    public static void main(String[] args) {

        System.out.println("Dividable by 3: ");
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Dividable by 5: ");
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Dividable by 3 & 5: ");
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
