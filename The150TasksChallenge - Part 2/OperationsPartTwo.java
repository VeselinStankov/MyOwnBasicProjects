package The150TasksChallenge;

import java.util.Scanner;

// Task 6.
public class OperationsPartTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d + %d = %d\n",a,b,a+b);
        System.out.printf("%d - %d = %d\n",a,b,a-b);
        System.out.printf("%d x %d = %d\n",a,b,a*b);
        System.out.printf("%d / %d = %d\n",a,b,a/b);
        System.out.printf("%d mod %d = %d\n",a,b,a%b);

    }
}
