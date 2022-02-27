package The150TasksChallenge;

import java.util.Scanner;

// Task 87.
public class SumOfTheDigitsOfAnInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String a = Integer.toString(n);

        int sum = 0;

        for (int i = 0; i <= a.length() - 1; i ++){
            sum += Character.getNumericValue(a.charAt(i));
        }

        String [] array = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        System.out.println(array[sum]);
    }
}
